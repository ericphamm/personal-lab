package cz.itnetwork.spring.controllers;

import cz.itnetwork.spring.dto.TitleDTO;
import cz.itnetwork.spring.models.CalculatorDTO;
import cz.itnetwork.spring.models.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("calculator")
public class CalculatorController {

//    @GetMapping("")
//    public String renderCalculator() {
//        return "index";
//    }

//    @GetMapping
//    public String renderSomething(Model model) {
//        model.addAttribute("pageTitle", "Spring Calculator!");
//
//        return "index";
//    }

    @GetMapping
    public String renderCalculator(@ModelAttribute TitleDTO titleDTO,
                                   @ModelAttribute CalculatorDTO calculatorDTO) {
        //set data intoDTO
        titleDTO.setTitle("SpringBoot Calculator!");
        titleDTO.setDescription("A simple calculator built with Spring Boot.");



        //return the view name
        return "index";
    }

//    @PostMapping
//    public String calculate(@ModelAttribute CalculatorDTO calculatorDTO,
//                            Model model) {
//        float calculationResult = calculatorService.calculate(calculatorDTO);
//        model.addAttribute("calculationResult", calculationResult);
//        return "result";
//    }

    @PostMapping
    public String calculate(@ModelAttribute CalculatorDTO calculatorDTO,
                            Model model) {
        float calculationResult = calculatorService.calculate(calculatorDTO);
        model.addAttribute("calculationResult", calculationResult);
        return "index";
    }



    @Autowired
    private CalculatorService calculatorService;


}
