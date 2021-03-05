package com.sendemails.sendemails.service;

import com.sendemails.sendemails.event.NotificationEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class SendMessageService {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void sendMessage(final String message) {
        NotificationEvent notificationEvent = new NotificationEvent(message);
        applicationEventPublisher.publishEvent(notificationEvent);
    }
}
