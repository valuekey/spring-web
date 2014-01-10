package com.baobaotao.introduce;

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
        ApplicationContext ctx = new ClassPathXmlApplicationContext("com/baobaotao/introduce/beans.xml");
        
        ForumService forumService = (ForumService) ctx.getBean("forumService");
        forumService.removeForum(10);
        forumService.removeTopic(1022);
        
        Monitorable monitorable = (Monitorable) forumService;
        monitorable.setMonitorAdvice(true);
        
        forumService.removeForum(10);
        forumService.removeTopic(1022);
    }

}
