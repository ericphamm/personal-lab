package eric.pham.ZvetseniTextu.controllers;

import eric.pham.ZvetseniTextu.dto.ZvetsovacDTO;
import eric.pham.ZvetseniTextu.services.ZvetsovacService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ZvetsovacController {

    @Autowired
    ZvetsovacService zvetsovacService;

    @GetMapping("/zvetsovac")
    public String ukazZvetsovac(Model model) {
        model.addAttribute("zvetsovacDTO", new ZvetsovacDTO());
        return "index";
    }

    @PostMapping("/zvetsovac")
    public String zvetsi(@ModelAttribute ZvetsovacDTO zvetsovacDTO,
                         @RequestParam("action") String action,
                         Model model) {
        String vyslednyText;
        if ("zvetsi".equals(action)) {
            vyslednyText = zvetsovacService.zvetsi(zvetsovacDTO);
        } else {
            vyslednyText = zvetsovacService.zmensi(zvetsovacDTO);
        }
        model.addAttribute("vyslednyText", vyslednyText);
        return "index";
    }
}
