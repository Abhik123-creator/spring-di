package com.dependencyi.dependencyi.controllers;

import com.dependencyi.dependencyi.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
