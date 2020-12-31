package com.maestro.examples.app.websockets.controllers;

import com.maestro.examples.app.websockets.services.NotifyService;
import com.maestro.examples.app.websockets.websockets.OutputMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class TestController {
    @Autowired
    private NotifyService notificationService;

    /**
     * GET  /notifications  -> show the notifications page.
     */
    @GetMapping("/notifications")
    public String notifications() {
        notificationService.notify(new OutputMessage("Bot 1", "Hello everyone", new SimpleDateFormat("HH:mm").format(new Date())));
        notificationService.notify(new OutputMessage("Bot 1", "Please ignore this message", new SimpleDateFormat("HH:mm").format(new Date())));
        notificationService.notify(new OutputMessage("Bot 1", "Test string", new SimpleDateFormat("HH:mm").format(new Date())));
        notificationService.notify(new OutputMessage("Bot 1", "Nice day", new SimpleDateFormat("HH:mm").format(new Date())));

        return "notifications";
    }
}
