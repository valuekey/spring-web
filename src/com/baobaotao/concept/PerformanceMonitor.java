package com.baobaotao.concept;

public class PerformanceMonitor {
    private static ThreadLocal<MethodPerformance> performanceRecord = new ThreadLocal<MethodPerformance>();
    
    public static void begin(String method) {
        System.out.println("begin...");
        MethodPerformance mp = new MethodPerformance(method);
        performanceRecord.set(mp);
    }
    
    public static void end() {
        System.out.println("end");
        MethodPerformance mp = performanceRecord.get();
        mp.printPerformance();
    }
}
