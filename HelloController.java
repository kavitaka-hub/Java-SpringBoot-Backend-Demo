// HelloController.java
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello GitHub! Spring Boot backend is running.";
    }

    @GetMapping("/sum")
    public String sumExample() {
        int a = 10;
        int b = 20;
        int sum = a + b;
        return "Sum of " + a + " and " + b + " is: " + sum;
    }
}