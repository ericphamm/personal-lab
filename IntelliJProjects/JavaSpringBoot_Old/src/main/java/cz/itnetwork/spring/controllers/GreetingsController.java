package cz.itnetwork.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/greetings")
public class GreetingsController {

    @GetMapping("/hello")
    public @ResponseBody String sayHi() { //pokud vracime pouze text tak to bude Responbody
        return "Hello World!";
    }

    @GetMapping("")
    public String sayHello() {
        return "hello-world"; //tady vracime nazev html souboru
    }

    @GetMapping("/button")
    public String klikni() {
        return "tlacitko";
    }
}
