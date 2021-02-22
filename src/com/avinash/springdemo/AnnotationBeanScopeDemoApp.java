package com.avinash.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {
        //load spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        //check if they are the same
        boolean check = (theCoach == alphaCoach);

        System.out.println("Check Same Status: " + check + " theCoach: " + theCoach + " alphaCoach: " + alphaCoach);
    }
}
