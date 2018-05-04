package com.DWiZero;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class SpringBootApplation
{
    public static void main(String[] args) throws Exception
    {
        SpringApplication.run(SpringBootApplation.class, args);
    }
}
