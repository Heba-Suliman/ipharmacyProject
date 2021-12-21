package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {
    @GetMapping("/distractmedicinekindservicefallback")
    public String distractServiceFallBackMethod(){
        return "add Service down ...";
    }

    @GetMapping("/addmedicinekindservicefallback")
    public String addServiceFallBackMethod(){
        return "distract Service down ...";
    }
}
