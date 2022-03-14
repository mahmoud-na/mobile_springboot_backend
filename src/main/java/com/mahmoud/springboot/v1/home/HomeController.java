package com.mahmoud.springboot.v1.home;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping(value = "/")
    public String greeting() {
        return "Hello Welcome to Spring!!!";
    }

    @GetMapping(value = "/{name}")
    public String greetingWithName(@PathVariable String name) {
        return String.format("Welcome %s to our Spring Boot App", name);
    }
}
