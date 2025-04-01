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
    public String showForm(Model model) {
        model.addAttribute("bmiDTO", new BMIDTO());
        return "index";
    }

    @PostMapping("/bmicalculator")
    public String calculate(Model model,
                            BMIDTO bmiDTO) {
        double bmiScore = bmiService.calculateBMI(bmiDTO);
        String bmiCategory = bmiService.getBMICategory(bmiScore);
        model.addAttribute("bmiDTO", bmiDTO);
        model.addAttribute("bmiScore", bmiScore);
        model.addAttribute("bmiCategory", bmiCategory);
        return "index";
    }
}