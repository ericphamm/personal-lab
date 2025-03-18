package eric.pham.RandomNumber.controllers;

import eric.pham.RandomNumber.dto.GeneratorDTO;
import eric.pham.RandomNumber.dto.TitleDTO;
import eric.pham.RandomNumber.services.GeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RandomController {

    @Autowired
    private GeneratorService generatorService;

    @GetMapping("/generator")
    public String showGenerator(@ModelAttribute TitleDTO titleDTO,
                                @ModelAttribute GeneratorDTO generatorDTO,
                                Model model ) {
        titleDTO.setTitle("Prvni Priklad: Generator Cisel!");
        model.addAttribute("generatorResult", "");
        return "index";
    }

    @PostMapping("/generator")
    public String vygeneruj(@ModelAttribute GeneratorDTO generatorDTO,
                            @ModelAttribute TitleDTO titleDTO,
                            Model model) {
        int generatorResult = generatorService.vygeneruj(generatorDTO);
        model.addAttribute("generatorResult", generatorResult);
        titleDTO.setTitle("Prvni Priklad: Generator Cisel!"); // Keep title the same
        return "index";
    }
}

