package cz.itnetwork.spring.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class GreetingsController {
    public String sayHi() {
        return "Hello World!";
    }
}
