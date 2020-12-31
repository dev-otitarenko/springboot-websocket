package com.maestro.examples.app.websockets.services;

import com.maestro.examples.app.websockets.websockets.OutputMessage;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service("messageService")
public class NotifyService {
    private final SimpMessagingTemplate messagingTemplate;

    public NotifyService(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    /**
     * Send notification to users subscribed on channel "/user/queue/notify".
     *
     * The message will be sent only to the user with the given username.
     *
     * @param notification The notification message.
     * @param username The username for the user to send notification.
     */
    public void notify(final OutputMessage notification, String username) {
        messagingTemplate.convertAndSendToUser(username, "/queue/notify", notification);
        return;
    }

    /**
     * Send notification to users subscribed on channel "/user/queue/notify".
     *
     * The message will be sent only to the user with the given username.
     *
     * @param notification The notification message.
     */
    public void notify(final OutputMessage notification) {
        messagingTemplate.convertAndSend("/topic/messages", notification);
        return;
    }
}
