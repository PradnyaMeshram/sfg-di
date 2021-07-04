package com.springframework.sfgdi.controllers;

import com.springframework.sfgdi.services.ConstructorGreetingService;
import com.springframework.sfgdi.services.GreetingService;
import com.springframework.sfgdi.services.SetterGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class SetterInjectionController {

    public SetterGreetingService greetingService;

    @Autowired
    @Qualifier("setterGreetingService")
    public void setGreetingService(SetterGreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }



}
