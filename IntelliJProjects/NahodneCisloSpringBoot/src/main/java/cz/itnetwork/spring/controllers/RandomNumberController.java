package cz.itnetwork.spring.controllers;

import cz.itnetwork.spring.models.RandomNumberDTO;
import cz.itnetwork.spring.models.RandomNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("random")
public class RandomNumberController {

    @GetMapping
    public String renderRandom(@ModelAttribute RandomNumberDTO randomNumberDTO) {
        return "random";
    }

    @PostMapping
    public String randomize(@ModelAttribute RandomNumberDTO randomNumberDTO,
                            Model model) {
        int randomResult = randomNumberService.randomize(randomNumberDTO);
        model.addAttribute("randomResult", randomResult);
        return "random";
    }

    @Autowired
    private RandomNumberService randomNumberService;
}
