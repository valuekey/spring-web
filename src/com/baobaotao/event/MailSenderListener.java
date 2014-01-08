package com.baobaotao.event;

import org.springframework.context.ApplicationListener;

public class MailSenderListener implements ApplicationListener<MailSendEvent>{
    @Override
    public void onApplicationEvent(MailSendEvent event) {
        MailSendEvent mse = event;
        System.out.println("MailSenderListener:" + mse.getTo());
    }

}
