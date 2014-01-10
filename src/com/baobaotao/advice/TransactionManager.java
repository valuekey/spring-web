package com.baobaotao.advice;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

public class TransactionManager implements ThrowsAdvice {
    public void afterThrowing(Method method, Object[] args, Object target, Exception ex) {
        System.out.println("-----------");
        System.out.println("method:" + method.getName());
        System.out.println("throw exception:" + ex.getMessage());
        System.out.println("rowBack OK~");
    }
}
