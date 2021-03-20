package com.sendemails.sendemails.event;

import org.springframework.context.ApplicationEvent;

public class EmailNotificationEvent extends ApplicationEvent {

    public EmailNotificationEvent(Object source) {
        super(source);
    }

    @Override
    public String toString() {
        return "NotificationEvent{" +
                "source=" + source +
                '}';
    }
}
