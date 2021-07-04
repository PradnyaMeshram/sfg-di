package com.springframework.sfgdi.controllers;

import com.springframework.sfgdi.services.ConstructorGreetingService;
import com.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectionController {

    public ConstructorGreetingService greetingService;


    public ConstructorInjectionController(@Qualifier("constructorGreetingService") ConstructorGreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
