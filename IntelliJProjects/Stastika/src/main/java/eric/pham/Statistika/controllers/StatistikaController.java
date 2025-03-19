package eric.pham.Statistika.controllers;

import eric.pham.Statistika.dto.StatistikaDTO;
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
        model.addAttribute("soucet", "");
        return "index";
    }

    @PostMapping("/statistika")
    public String renderStatistika(@ModelAttribute StatistikaDTO statistikaDTO,
                                   Model model) {
        int soucet = statistikaService.spocitejSoucet(statistikaDTO);
        int nejmensi = statistikaService.spocitejNejmensi(statistikaDTO);
        int nejvetsi = statistikaService.spocitejNejvetsi(statistikaDTO);
        float prumer = statistikaService.spocitejPrumer(statistikaDTO);
        model.addAttribute("soucet", soucet);
        model.addAttribute("nejmensi", nejmensi);
        model.addAttribute("nejvetsi", nejvetsi);
        model.addAttribute("prumer", prumer);
        return "index";
    }
}
