package com.maestro.examples.app.websockets.task;

import com.maestro.examples.app.websockets.domain.OutputMessage;
import com.maestro.examples.app.websockets.services.NotifyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
@Service
public class TaskService {
    private final NotifyService notificationService;

    public TaskService(NotifyService notificationService) {
        this.notificationService = notificationService;
    }

    @Scheduled(fixedRateString = "${app.job.rate}")
    public void sendTestMessages() {
        SimpleDateFormat formatTime = new SimpleDateFormat("HH:mm:ss"),
                         formatFull = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        final String strCurdate = formatTime.format(new Date());

        notificationService.notify(new OutputMessage("AutoBot", "Hello everyone!!", strCurdate));
        notificationService.notify(new OutputMessage("AutoBot", "Please ignore this message", strCurdate));
        notificationService.notify(new OutputMessage("AutoBot", String.format("Service message \"%s\"", formatFull.format(new Date())), strCurdate));
        notificationService.notify(new OutputMessage("AutoBot", "See you", strCurdate));
    }
}
