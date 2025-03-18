package eric.pham.SpringKalkulacka.controllers;

import eric.pham.SpringKalkulacka.dto.CalculatorDTO;
import eric.pham.SpringKalkulacka.dto.TitleDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("kalkulacka")
public class KalkulackaController {

    @GetMapping
    public String zobrazujKalkulacku(@ModelAttribute TitleDTO titleDTO,
                                     @ModelAttribute CalculatorDTO calculatorDTO) {
        titleDTO.setTitle("Takhle se zobrazuje nadpis");
        return "index";
    }

    @PostMapping
    public String calculate(
            @ModelAttribute CalculatorDTO calculatorDTO,
            Model model
    ) {
        return "result";
    }
}
