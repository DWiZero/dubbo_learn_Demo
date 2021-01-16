package com.DWiZero;

import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfig
public class ProductApplication
{
    public static void main(String[] args) throws Exception
    {
        SpringApplication.run(ProductApplication.class, args);
    }
}
