package eric.pham.SpringKalkulacka.controllers;

import eric.pham.SpringKalkulacka.dto.CalculatorDTO;
import eric.pham.SpringKalkulacka.dto.TitleDTO;
import eric.pham.SpringKalkulacka.services.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class KalkulackaController {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("/kalkulacka")
    public String zobrazujKalkulacku(@ModelAttribute TitleDTO titleDTO,
                                     @ModelAttribute CalculatorDTO calculatorDTO) {
        titleDTO.setTitle("Takhle se zobrazuje nadpis");
        return "index";
    }

    @PostMapping("/kalkulacka")
    public String calculate(
            @ModelAttribute CalculatorDTO calculatorDTO,
            Model model,
            @ModelAttribute TitleDTO titleDTO
    ) {
        titleDTO.setTitle("Takhle se zobrazuje nadpis");
        float calculationResult = calculatorService.calculate(calculatorDTO);
        model.addAttribute("calculationResult", calculationResult);
        return "index";
    }
}
