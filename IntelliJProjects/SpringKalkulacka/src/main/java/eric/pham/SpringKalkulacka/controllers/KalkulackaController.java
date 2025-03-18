package eric.pham.SpringKalkulacka.controllers;

import eric.pham.SpringKalkulacka.dto.TitleDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("kalkulacka")
public class KalkulackaController {

    @GetMapping
    public String zobrazujKalkulacku(@ModelAttribute TitleDTO titleDTO) {
        titleDTO.setTitle("Takhle se zobrazuje nadpis");
        return "index";
    }

//    @GetMapping
//    public String renderSomething(Model model) {
//        model.addAttribute("pageTitle", "Toto je Spring Kalkulacka!");
//
//        return "index";
//    }
}
