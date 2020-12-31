package com.maestro.examples.app.websockets.domain;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class Message {
    private String from;
    private String text;
}
