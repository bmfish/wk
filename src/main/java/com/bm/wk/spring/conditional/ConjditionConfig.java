package com.bm.wk.spring.conditional;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConjditionConfig {

    @Conditional(WindowsCondition.class)
    public String windowsMessage(){
        System.out.println("windows s");
        return "windows s";
    }

}
