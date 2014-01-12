package com.baobaotao.ltw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("com/baobaotao/ltw/beans.xml");
        Waiter waiter = (Waiter)ctx.getBean(Waiter.class);
        waiter.greetTo("YYQ");
        waiter.serveTo("YYQ");
        
    }

}
