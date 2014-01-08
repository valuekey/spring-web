package com.baobaotao.proxy;

public class Test {
    public static void main(String[] args) {
        CglibProxy proxy = new CglibProxy();
        
        ForumServiceImpl fsi = (ForumServiceImpl)proxy.getProxy(ForumServiceImpl.class);
        fsi.removeForum(110);
        fsi.removeTopic(911);
        
    }

}
