package com.example.student_api.Controller;

import java.util.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping("/hello")
    public String hello(){
        return "Hello Brother";
    }

    @GetMapping("/Hlo")
    public Map<String,String> Hlo(){
        return Map.of("message", "Hello", "framWork", "Spring Boot");
    }
}
