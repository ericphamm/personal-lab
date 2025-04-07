package eric.pham.springblog.controllers;

import eric.pham.springblog.models.ArticleDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/articles")
public class ArticleController {

    @GetMapping
    public String renderIndex() {
        return "pages/articles/index";
    }

    @GetMapping("create")
    public String renderCreateForm(@ModelAttribute ArticleDTO article) {
        return "pages/articles/create";
    }
}
