package com.baobaotao;

public class NaiveWaiter implements Waiter{
    @Override
    public void greetTo(String name) {
        System.out.println("greetTo " + name);
    }
    
    @Override
    public void serveTo(String name) {
        System.out.println("serveTo " + name);
    }
}
