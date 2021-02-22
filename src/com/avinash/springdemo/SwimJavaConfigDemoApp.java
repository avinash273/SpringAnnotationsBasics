package com.avinash.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
    public static void main(String[] args) {
        //Read Spring Config file
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        //get the bean from spring container
        Coach theCoach = context.getBean("swimCoach", Coach.class);

        //call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        //call method to get daily fortune
        System.out.println(theCoach.getDailyFortune());

        //close the context
        context.close();
    }
}
