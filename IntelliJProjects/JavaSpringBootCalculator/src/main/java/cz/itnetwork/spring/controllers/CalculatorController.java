package cz.itnetwork.spring.controllers;

import cz.itnetwork.spring.models.CalculatorDTO;
import cz.itnetwork.spring.models.CalculatorService;
import cz.itnetwork.spring.models.PismenoDTO;
import cz.itnetwork.spring.models.TitleDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("calculator")
public class CalculatorController {

    @GetMapping
    public String renderCalculator(@ModelAttribute TitleDTO titleDTO,
                                   @ModelAttribute PismenoDTO pismenoDTO,
                                   @ModelAttribute CalculatorDTO calculatorDTO) {
        titleDTO.setTitle("Kalkulacka v Springu");
        pismenoDTO.setPismeno("Tohle je zkusebni text, uvidime jak to bude fungovat");

        return "calculator";
    }

    @PostMapping
    public String calculate(@ModelAttribute CalculatorDTO calculatorDTO,
                            Model model) {
        float calculationResult = calculatorService.calculate(calculatorDTO);
        model.addAttribute("calculationResult", calculationResult);
        return "result";
    }

    @Autowired
    private CalculatorService calculatorService;

    @ExceptionHandler(IllegalArgumentException.class)
    public String handleIllegalArgumentException() {
        return "invalid-form";
    }

}
