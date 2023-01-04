package com.bridgelabz.springconceptsapplication;

import com.bridgelabz.springconceptsapplication.Component.DemoBean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringConceptsApplication {

    public static void main(String[] args) {
        System.out.println("Welcome to Spring Concept Demo");
        ApplicationContext context = SpringApplication.run(SpringConceptsApplication.class, args);
        System.out.println("Checking context " + context.getBean(DemoBean.class));
    }

}
