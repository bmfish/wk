package com.bm.wk;

import com.bm.wk.spring.event.DemoPublisher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableAsync
@EnableScheduling
public class BmWkApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(BmWkApplication.class, args);
        DemoPublisher demoPublisher = applicationContext.getBean(DemoPublisher.class);
        demoPublisher.pushMessage("hello world");
    }

}
