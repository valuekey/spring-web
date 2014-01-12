package com.baobaotao.aspectj.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.baobaotao.Waiter;

public class Test {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ApplicationContext cxt = new ClassPathXmlApplicationContext("com/baobaotao/aspectj/example/beans.xml");
        
        Waiter proxy = (Waiter)cxt.getBean("waiter");
        proxy.greetTo("YYQ");
        proxy.serveTo("YYQ");
    }

}
