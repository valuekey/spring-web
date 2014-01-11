package com.baobaotao.advisor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ApplicationContext ct = new ClassPathXmlApplicationContext("com/baobaotao/advisor/beans.xml");
        
        Waiter waiter = (Waiter)ct.getBean("waiter");
        Seller seller = (Seller)ct.getBean("seller");
        
        waiter.greetTo("YYQ");
        waiter.serveTo("hehe");
        seller.greetTo("YYQ");
    }

}
