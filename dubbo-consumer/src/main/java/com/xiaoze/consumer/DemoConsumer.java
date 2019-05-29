package com.xiaoze.consumer;

import com.xiaoze.api.service.DemoService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DemoConsumer implements InitializingBean {

    @Autowired
    private DemoService demoService;

    @Override
    public void afterPropertiesSet(){
        String response = demoService.sayHello("hh");
        System.out.println("response = " + response);
    }
}
