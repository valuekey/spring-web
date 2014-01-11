package com.baobaotao.advisor;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.DynamicMethodMatcherPointcut;

public class GreetingDynamicPointcut extends DynamicMethodMatcherPointcut {

    private static List<String> specialClientList = new ArrayList<String>();
    static {
        specialClientList.add("YYQ");
        specialClientList.add("hehe");
    }

    @Override
    public ClassFilter getClassFilter() {

        return new ClassFilter() {

            @Override
            public boolean matches(Class<?> clazz) {
                System.out.println("调用getClassFilter()对" + clazz.getName()
                        + "做静态检查");
                return Waiter.class.isAssignableFrom(clazz);
            }
        };
    }

    @Override
    public boolean matches(Method method, Class<?> targetClass) {
        System.out.println("调用matches(Method method, Class<?> targetClass)对"
                + targetClass.getName() + "." + method.getName() + "做静态检查");

        return "greetTo".equals(method.getName());
    }

    @Override
    public boolean matches(Method method, Class<?> targetClass, Object[] args) {

        System.out
                .println("调用matches(Method method, Class<?> targetClass, Object[] args)对"
                        + targetClass.getName()
                        + "."
                        + method.getName()
                        + "做静态检查");
        String clientName = (String) args[0];

        return specialClientList.contains(clientName);
    }

}
