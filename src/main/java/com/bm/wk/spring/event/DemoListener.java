package com.bm.wk.spring.event;

import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

    @Async
    @Override
    public void onApplicationEvent(DemoEvent event) {

        String message=event.getMessage();
        System.out.println(Thread.currentThread().getName()+"recevie message:"+message);
    }
}
