package com.devops.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class UserController {
    
    @GetMapping("/")
    public String getMethodName() {
        return "hello";
    }
    
}
