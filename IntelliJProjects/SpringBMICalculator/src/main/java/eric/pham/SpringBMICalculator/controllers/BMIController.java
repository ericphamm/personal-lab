package eric.pham.SpringBMICalculator.controllers;

import eric.pham.SpringBMICalculator.dto.BMIDTO;
import eric.pham.SpringBMICalculator.services.BMIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BMIController {

    @Autowired
    BMIService bmiService;

    @GetMapping("/bmicalculator")
    public String showCalculator(Model model) {
        model.addAttribute("bmiDTO", new BMIDTO());
        return "index";
    }

    @PostMapping("/bmicalculator")
    public String calculate(@ModelAttribute BMIDTO bmiDTO,
                            Model model) {
        double bmiResult = bmiService.calculate(bmiDTO);
        return "index";
    }
}
