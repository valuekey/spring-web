package com.baobaotao.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("com/baobaotao/event/beans.xml");
        
        MailSender mailSender = (MailSender) ctx.getBean("mailSender");
        mailSender.sendMail("553993151@qq.com");
    }
}
