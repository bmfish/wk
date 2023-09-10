package com.bm.wk.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * SSE 服务端像前端推送
 */

@Controller
@Slf4j
public class SseController {

    @RequestMapping(value = "/sse", method = RequestMethod.GET, produces = {"text/event-stream"})
    public  @ResponseBody  String getUnitAreaInfoSSE(){

        Random random=new Random();


            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

         return "data:test 1,2,3"+random.nextInt()+"\n\n";

    }
}
