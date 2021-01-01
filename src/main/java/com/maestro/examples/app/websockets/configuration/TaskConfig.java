package com.maestro.examples.app.websockets.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
@ComponentScan({ "com.maestro.examples.app.websockets.task" })
public class TaskConfig {
}
