package com.baobaotao.event;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MailSender implements ApplicationContextAware {
    private ApplicationContext ctx;
    
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.ctx = applicationContext;
    }
    
    public void sendMail(String to) {
        System.out.println("send...");
        MailSendEvent mse = new MailSendEvent(this.ctx, to);
        ctx.publishEvent(mse);
    }
}
