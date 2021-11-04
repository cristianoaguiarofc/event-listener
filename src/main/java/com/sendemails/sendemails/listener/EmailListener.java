package com.sendemails.sendemails.listener;

import com.sendemails.sendemails.event.EmailNotificationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class EmailListener implements ApplicationListener<EmailNotificationEvent> {

    @Override
    public void onApplicationEvent(EmailNotificationEvent emailNotificationEvent) {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(emailNotificationEvent.toString());
    }
}
