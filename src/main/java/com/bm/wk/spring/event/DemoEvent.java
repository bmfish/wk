package com.bm.wk.spring.event;

import lombok.Data;
import org.springframework.context.ApplicationEvent;

import java.time.Clock;

@Data
public class DemoEvent extends ApplicationEvent {

    private String message;

    public DemoEvent(Object source, String message) {
        super(source);
        this.message=message;

    }
}
