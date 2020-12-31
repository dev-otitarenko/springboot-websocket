package com.maestro.examples.app.websockets.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
@Getter
public class OutputMessage {
    private String from;
    private String text;
    private String time;
}
