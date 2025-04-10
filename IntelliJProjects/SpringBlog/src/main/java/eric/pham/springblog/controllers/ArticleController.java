package eric.pham.springblog.controllers;

import eric.pham.springblog.models.ArticleDTO;
import eric.pham.springblog.models.services.ArticleService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/articles")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping
    public String renderIndex() {
        return "pages/articles/index";
    }

    @GetMapping("create")
    public String renderCreateForm(@ModelAttribute ArticleDTO article) {
        return "pages/articles/create";
    }

    @PostMapping("create")
    public String createArticle(@Valid @ModelAttribute ArticleDTO article,
                                BindingResult result) {
        if (result.hasErrors())
            return renderCreateForm(article);

        articleService.create(article); // <-- Přidání článku do databáze

        return "redirect:/articles";
    }
}
