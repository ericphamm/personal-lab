import eric.pham.SpringBMICalculator.dto.BMIDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BMIController {

    @GetMapping("/bmicalculator")
    public String showForm(Model model) {
        model.addAttribute("bmiDTO", new BMIDTO());
        return "index";
    }

    @PostMapping("/bmicalculator")
    public String calculate(Model model,
                            BMIDTO bmiDTO) {
        model.addAttribute("bmiDTO", bmiDTO);
        return "index";
    }
}