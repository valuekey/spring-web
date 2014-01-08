package com.baobaotao.advice;

public class NewWaiter implements Waiter {

    @Override
    public void greetTo(String name) {
        System.out.println(name + "...greet");
    }

    @Override
    public void serveTo(String name) {
        System.out.println(name + "...serve");
    }

}
