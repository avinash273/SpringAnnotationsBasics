package com.avinash.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component()
public class TennisCoach implements Coach{

    private FortuneService fortuneService;

//    @Autowired
//    public TennisCoach(FortuneService theFortuneService){
//        fortuneService = theFortuneService;
//    }

    //define a default constructor
    public TennisCoach(){
        System.out.println("Inside default constructor for TennisCoach");
    }

    //define a setter method
    @Autowired
    public void setFortuneService(FortuneService theFortuneService){
        System.out.println("TennisCoach: inside setter injection setFortuneService");
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backend volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
