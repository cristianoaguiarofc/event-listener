package com.sendemails.sendemails.listener;

import com.sendemails.sendemails.event.NotificationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class EmailListener implements ApplicationListener<NotificationEvent> {

    @Override
    public void onApplicationEvent(NotificationEvent notificationEvent) {
        System.out.println(notificationEvent.toString());
    }
}
