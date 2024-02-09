package com.platzi.platzimarket;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class Controller {
    @GetMapping("/hi")
    public String greet(){
        return "Hello world!";
    }
}
