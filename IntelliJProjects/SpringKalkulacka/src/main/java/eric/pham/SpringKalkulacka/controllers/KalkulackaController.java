package eric.pham.SpringKalkulacka.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("kalkulacka")
public class KalkulackaController {

    @GetMapping
    public String zobrazujKalkulacku() {
        return "index";
    }

}
