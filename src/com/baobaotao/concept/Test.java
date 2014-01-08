package com.baobaotao.concept;

import java.lang.reflect.Proxy;

public class Test {

    /**
     * @param args
     */
    public static void main(String[] args) {

//        ForumServiceImpl fsi = new ForumServiceImpl();
//        fsi.removeForum(110);
//        fsi.removeTopic(911);
        
        ForumService target = new ForumServiceImpl();
        
        PerformanceHandler handler = new PerformanceHandler(target);
        
        ForumService proxy = (ForumService)Proxy.newProxyInstance(target.getClass().getClassLoader(), 
                target.getClass().getInterfaces(), handler);
        
        proxy.removeForum(110);
        proxy.removeTopic(911);
    }

}
