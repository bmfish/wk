package com.bm.wk.controller;

import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import java.io.IOException;

class ThreadDemo2 implements Runnable {
   
    private SseEmitter event;
   
    public ThreadDemo2(SseEmitter event) {

        this.event = event;
    }
     
    @Override
    public void run() {

        while(true) {

            try {
               
                Thread.sleep(2000);
                System.out.println("数据推送--------" + "服务器端数据");
                event.send(SseEmitter.event().data("服务器端数据"));
            } catch (IOException e) {
                System.out.println(e.toString());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
     
}