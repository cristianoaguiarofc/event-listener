package com.sendemails.sendemails.service;

import com.sendemails.sendemails.event.EmailNotificationEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class SendMessageService {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void sendMessage(final String message) {
        EmailNotificationEvent emailNotificationEvent = new EmailNotificationEvent(message);
        applicationEventPublisher.publishEvent(emailNotificationEvent);
    }
}
