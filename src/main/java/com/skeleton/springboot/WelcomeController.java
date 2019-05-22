package com.skeleton.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class WelcomeController {

    @GetMapping("/")
    public String index() {

        return "Welcome Developer!";
    }
}
