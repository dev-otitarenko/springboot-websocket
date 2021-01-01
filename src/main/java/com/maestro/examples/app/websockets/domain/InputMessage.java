package com.maestro.examples.app.websockets.domain;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
/*
* Message received from users **/
public class InputMessage {
        // from user
    private String from;
        // message
    private String text;
}
