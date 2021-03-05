package com.sendemails.sendemails.event;

import org.springframework.context.ApplicationEvent;

public class NotificationEvent extends ApplicationEvent {

    public NotificationEvent(Object source) {
        super(source);
    }

    @Override
    public String toString() {
        return "NotificationEvent{" +
                "source=" + source +
                '}';
    }
}
