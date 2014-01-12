package com.baobaotao.aspectj.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.baobaotao.Seller;
import com.baobaotao.Waiter;

public class Test {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ApplicationContext cxt = new ClassPathXmlApplicationContext("com/baobaotao/aspectj/basic/beans.xml");
        
        Waiter waiter = (Waiter) cxt.getBean("waiter");
        waiter.greetTo("YYQ");
        waiter.serveTo("YYQ");
        
        Seller seller = (Seller) waiter;
        seller.sell("Beer", "YYQ");
        
    }

}
