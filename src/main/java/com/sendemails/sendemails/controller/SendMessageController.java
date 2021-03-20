package com.sendemails.sendemails.controller;

import com.sendemails.sendemails.service.SendMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendMessageController {

    @Autowired
    private SendMessageService sendMessageService;

    @PostMapping("/send")
    public ResponseEntity sendMessage(@RequestBody String message) {
        sendMessageService.sendMessage(message);

        return ResponseEntity.ok().build();
    }
}
