package com.k0c3.spring.demo.mycoolapp.rest;

import com.k0c3.spring.demo.mycoolapp.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private final Coach myCoach;
    @Autowired
    public DemoController(Coach theCoach)
    {
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyworkout(){

        return myCoach.getDailyWorkout();
    }
}
