package com.avinash.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {
        //Read Spring Config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //get the bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        //call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        //close the context
        context.close();
    }
}
