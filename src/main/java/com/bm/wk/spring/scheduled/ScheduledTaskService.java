package com.bm.wk.spring.scheduled;

import com.bm.wk.spring.event.DemoPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.util.Date;

@Component
public class ScheduledTaskService {

    @Autowired
    DemoPublisher demoPublisher;


    @Scheduled(fixedRate = 50000)
    public void reportCurrentTIme(){

        demoPublisher.pushMessage(DateFormat.getInstance().format(new Date()));

    }
}
