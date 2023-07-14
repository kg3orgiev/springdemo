package com.k0c3.spring.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;
    @GetMapping("/")
    public String sayHello(){
        return "Hello World 2";
    }

    @GetMapping("/teaminfo")
    public String sayTeamInfo(){
        return "Team : " + teamName + " has coach " + coachName;
    }

    @GetMapping("/fortune")
    public String sayFortune(){
        return "Today is your lucky day";
    }
}
