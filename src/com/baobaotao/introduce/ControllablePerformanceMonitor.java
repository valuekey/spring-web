package com.baobaotao.introduce;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;

public class ControllablePerformanceMonitor extends DelegatingIntroductionInterceptor implements Monitorable{

    private ThreadLocal<Boolean> monitorStatusMap = new ThreadLocal<Boolean>();
    
    @Override
    public void setMonitorAdvice(boolean advice) {
        this.monitorStatusMap.set(advice);
    }
    
    @Override
    public Object invoke(MethodInvocation mi) throws Throwable {
        Object obj = null;
        
        if(this.monitorStatusMap.get() != null && this.monitorStatusMap.get()) {
            PerformanceMonitor.begin(mi.getClass().getName() + "." + mi.getMethod().getName());
            obj = super.invoke(mi);
            PerformanceMonitor.end();
        }else {
            obj = super.invoke(mi);
        }
        return obj;
    }
    
}
