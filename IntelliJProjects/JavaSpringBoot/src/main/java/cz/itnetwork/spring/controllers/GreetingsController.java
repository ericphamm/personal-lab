package cz.itnetwork.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/pozdrav")
public class GreetingsController {

    @GetMapping("/stranka")
    public String sayHi() {
        return "pozdrav";
    }

    @GetMapping("lorem")
    public @ResponseBody String sayLorem() {
        return "Lorem epsum";
    }
}
