package com.baobaotao.advisor;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class GreetingBeforAdvice implements MethodBeforeAdvice{

    @Override
    public void before(Method method, Object[] args, Object target)
            throws Throwable {
        // TODO Auto-generated method stub
        System.out.println(target.getClass().getName() + "." + method.getName());
        String clientName = (String) args[0];
        System.out.println("nihao~ " + clientName);
    }
}
