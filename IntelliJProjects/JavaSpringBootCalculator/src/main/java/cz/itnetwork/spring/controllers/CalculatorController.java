package cz.itnetwork.spring.controllers;

import cz.itnetwork.spring.dto.TitleDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("calculator")
public class CalculatorController {

//    @GetMapping("")
//    public String renderCalculator() {
//        return "index";
//    }

    @GetMapping
    public String renderSomething(Model model) {
        model.addAttribute("pageTitle", "Spring Calculator!");

        return "index";
    }

    @GetMapping
    public String renderCalculator(TitleDTO titleDTO) {
        //set data intoDTO
        titleDTO.setTitle("SpringBoot Calculator!");

        //return the view name
        return "index.html";
    }
}
