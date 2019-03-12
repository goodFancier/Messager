package com.messager;

import com.messager.config.JpaConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;

@SpringBootApplication
public class Messager
{
    public static void main(String[] args)
    {
        SpringApplication.run(new Class<?>[]{Messager.class, JpaConfig.class}, args);
    }
}
