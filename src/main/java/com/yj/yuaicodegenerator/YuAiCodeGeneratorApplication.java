package com.yj.yuaicodegenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(exposeProxy = true)
public class YuAiCodeGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(YuAiCodeGeneratorApplication.class, args);
    }

}
