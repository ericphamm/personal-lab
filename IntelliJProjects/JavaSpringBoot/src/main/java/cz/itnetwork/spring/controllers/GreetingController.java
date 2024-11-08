package cz.itnetwork.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping ()
public class GreetingController {


    @GetMapping ("/greetings")
    public String sayHello() {
        return "hello-world";
    }

    @GetMapping("second")
    public String tlacitko() {
        return "second";
    }
}
