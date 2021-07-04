package com.springframework.sfgdi.controllers;

import com.springframework.sfgdi.services.GreetingService;
import com.springframework.sfgdi.services.PropertyGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectionController {

    @Autowired
    @Qualifier("propertyGreetingService")
    public PropertyGreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }




}
