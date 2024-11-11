package cz.itnetwork.todoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

//    na hlavni strance bude vracet Hello World, ResponseBody = v tele stranky, cela metoda je jedna akce
    @GetMapping ("/")
    public @ResponseBody String helloWorld() {
        return "Hello World!";
    }

    //GetMappy je endpoint url, return vraci na ktere html template to bude
    @GetMapping ("/hello")
    public String hello(Model model) {
        model.addAttribute("name", "ITnetwork");
        return "helloworld";
    }
}
