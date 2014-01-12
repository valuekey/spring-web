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
        
//        Waiter waiter = (Waiter)ct.getBean("waiter1");
//        Seller seller = (Seller)ct.getBean("seller");
        
//        waiter.greetTo("YYQ");
//        waiter.serveTo("hehe");
//        seller.greetTo("YYQ");
//        Waiter waiter = (Waiter)ct.getBean("waiter2");
//        
//        waiter.serveTo("111");
//        waiter.greetTo("111");
//        waiter.serveTo("YYQ");
//        waiter.greetTo("YYQ");
//      Waiter waiter = (Waiter)ct.getBean("waiter3");
//      
//      WaiterDelegate delegate = new WaiterDelegate();
//      
//      delegate.setWaiter(waiter);
//      
//      waiter.serveTo("YYQ");
//      waiter.greetTo("YYQ");
//      delegate.service("YYQ");
        
//      Waiter waiter = (Waiter)ct.getBean("waiter4");
//      
//      WaiterDelegate delegate = new WaiterDelegate();
//      
//      delegate.setWaiter(waiter);
//      
//      waiter.serveTo("YYQ");
//      waiter.greetTo("YYQ");
//      delegate.service("YYQ");
      Waiter waiter = (Waiter)ct.getBean("waiter11");
      Seller seller = (Seller)ct.getBean("seller11");
      
      waiter.greetTo("YYQ");
      waiter.serveTo("YYQ");
      seller.greetTo("YYQ");
    }

}
