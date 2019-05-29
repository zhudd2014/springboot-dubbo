package com.xiaoze.provider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * DubboProviderApplication
 * 服务提供启动类
 * @author xiaoze
 * @date 2018/6/7
 */
@EnableDubbo
@SpringBootApplication
public class DubboProviderApplication {

    public static void main(String[] args) {
        try {
            ClassPathXmlApplicationContext applicationContext =
                    new ClassPathXmlApplicationContext(new String[]{"application-spring.xml"});
            applicationContext.start();
            System.err.println("*******************************");
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        SpringApplication.run(DubboProviderApplication.class, args);
    }
}
