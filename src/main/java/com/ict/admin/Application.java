package com.ict.admin;

import org.springframework.boot.SpringApplication;
import  org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import static org.springframework.boot.SpringApplication.*;

//@EnableJpaAuditing
@SpringBootApplication
public class Application {
    public static void main(String[] args){

        SpringApplication.run(Application.class, args);
    }
}
