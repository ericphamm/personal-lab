package eric.pham.Statistika.controllers;

import eric.pham.Statistika.dto.StatistikaDTO;
import eric.pham.Statistika.dto.StatistikaResultDTO;
import eric.pham.Statistika.services.StatistikaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.OptionalDouble;

@Controller
public class StatistikaController {

    @Autowired
    StatistikaService statistikaService;

    @GetMapping("/statistika")
    public String renderIndex(@ModelAttribute StatistikaDTO statistikaDTO,
                            Model model) {
        model.addAttribute("statistikaDTO", new StatistikaDTO());
        model.addAttribute("statistikaResultDTO", null);
        return "index";
    }

    @PostMapping("/statistika")
    public String renderStatistika(@ModelAttribute StatistikaDTO statistikaDTO,
                                   Model model) {
        StatistikaResultDTO result = statistikaService.vygenerujStatistiku(statistikaDTO);
        model.addAttribute("statistikaResultDTO", result);
        return "index";
    }
}
