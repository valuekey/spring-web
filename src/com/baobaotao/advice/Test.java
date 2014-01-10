package com.baobaotao.advice;

import org.springframework.aop.AfterAdvice;
import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /*
         * Waiter target = new NewWaiter(); BeforeAdvice advice = new GreetingBeforeAdvice(); AfterAdvice afterAdvice = new
         * GreetingAfterAdvice(); ProxyFactory pf = new ProxyFactory(); pf.setInterfaces(target.getClass().getInterfaces());
         * pf.setOptimize(true); pf.setTarget(target); pf.addAdvice(advice); pf.addAdvice(afterAdvice); Waiter proxy =
         * (Waiter)pf.getProxy(); proxy.greetTo("YYQ"); proxy.serveTo("QQY");
         */
        ApplicationContext ctx = new ClassPathXmlApplicationContext("com/baobaotao/advice/beans.xml");

        Waiter proxy = (Waiter) ctx.getBean("waiter");
        proxy.serveTo("YYQ");

        ForumService fs = (ForumService) ctx.getBean("forumService");

        try {
            fs.remove(1);

        } catch (Exception e) {
            try {
                fs.updateForum("haha");
            } catch (Exception e1) {
            }
        }
    }

}
