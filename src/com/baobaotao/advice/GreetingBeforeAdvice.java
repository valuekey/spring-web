package com.baobaotao.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class GreetingBeforeAdvice implements MethodBeforeAdvice {
    
    @Override
    public void before(Method method, Object[] args, Object obj)
            throws Throwable {
        String clientName = (String)args[0];
        System.out.println("nihao " + clientName);
    }
}
