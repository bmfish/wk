package com.bm.wk.spring.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DemoPublisher {

    @Autowired
    ApplicationContext applicationContext;

    public void pushMessage(String message){
        applicationContext.publishEvent(new DemoEvent(this,message));
    }
}
