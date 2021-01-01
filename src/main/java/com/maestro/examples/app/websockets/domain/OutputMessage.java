package com.maestro.examples.app.websockets.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
@Getter
/*
* The message sending to users **/
public class OutputMessage {
        // from user/service
    private String from;
        // message
    private String text;
        // time (value in string as example)
    private String time;
}
