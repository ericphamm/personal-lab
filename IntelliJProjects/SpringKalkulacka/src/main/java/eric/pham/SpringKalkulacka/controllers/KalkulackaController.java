package eric.pham.SpringKalkulacka.controllers;

import eric.pham.SpringKalkulacka.dto.CalculatorDTO;
import eric.pham.SpringKalkulacka.dto.TitleDTO;
import eric.pham.SpringKalkulacka.services.CalculatorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
public class KalkulackaController {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("/kalkulacka")
    public String zobrazujKalkulacku(Model model) {
        TitleDTO titleDTO = new TitleDTO();
        titleDTO.setTitle("Vitejte ve SpringKalkulace!");
        model.addAttribute("titleDTO", titleDTO);
        model.addAttribute("calculatorDTO", new CalculatorDTO());
        return "index";
    }

    @PostMapping("/kalkulacka")
    public String calculate(
            @Valid @ModelAttribute("calculatorDTO") CalculatorDTO calculatorDTO,
            BindingResult bindingResult,
            Model model
    ) {
        // Add title to model
        TitleDTO titleDTO = new TitleDTO();
        titleDTO.setTitle(bindingResult.hasErrors() ? "Zadajte spravne hodnoty" : "Takhle se zobrazuje nadpis");
        model.addAttribute("titleDTO", titleDTO);

        if (bindingResult.hasErrors()) {
            return "index";
        }

        float calculationResult = calculatorService.calculate(calculatorDTO);
        model.addAttribute("calculationResult", calculationResult);
        return "index";
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public String handleIllegalArgumentException() {
        return "invalid-form";
    }
}
