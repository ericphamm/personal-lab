package cz.itnetwork.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingsController {

    @GetMapping("/pozdrav")
    public @ResponseBody String sayHi() {
        return "Hello World!";
    }
}
