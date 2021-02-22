package com.avinash.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.annotation.Annotation;

public class JavaConfigDemoApp {
    public static void main(String[] args) {
        //Read Spring Config file
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        //get the bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        //call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        //call method to get daily fortune
        System.out.println(theCoach.getDailyFortune());

        //close the context
        context.close();
    }
}