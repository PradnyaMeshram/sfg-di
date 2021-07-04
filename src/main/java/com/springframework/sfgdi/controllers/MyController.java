package com.springframework.sfgdi.controllers;

import com.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public GreetingService greetingService;

    public String getGreeting() {

        return greetingService.sayGreeting();
    }
}
