package eric.pham.springblog.controllers;

import eric.pham.springblog.models.dto.ArticleDTO;
import eric.pham.springblog.models.dto.mappers.ArticleMapper;
import eric.pham.springblog.models.services.ArticleService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/articles")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping
    public String renderIndex(Model model) {
        List<ArticleDTO> articles = articleService.getAll();
        model.addAttribute("articles", articles);

        return "pages/articles/index";
    }

    @GetMapping("create")
    public String renderCreateForm(@ModelAttribute ArticleDTO article) {
        return "pages/articles/create";
    }

    @GetMapping("{articleId}")
    public String renderDetail(
            @PathVariable("articleId") long articleId,
            Model model
    ) {
        ArticleDTO article = articleService.getById(articleId);
        model.addAttribute("article", article);

        return "pages/articles/detail";
    }

    @PostMapping("create")
    public String createArticle(
            @Valid @ModelAttribute ArticleDTO article,
            BindingResult result
    ) {
        if (result.hasErrors())
            return renderCreateForm(article);

        articleService.create(article);

        return "redirect:/articles";
    }

    @Autowired
    private ArticleMapper articleMapper;

    @GetMapping("edit/{articleId}")
    public String renderEditForm(
            @PathVariable("articleId") long articleId,
            ArticleDTO article
    ) {
        ArticleDTO fetchedArticle = articleService.getById(articleId);
        articleMapper.updateArticleDTO(fetchedArticle, article);

        return "pages/articles/edit";
    }

    @PostMapping("edit/{articleId}")
    public String editArticle(
            @PathVariable("articleId") long articleId,
            @Valid ArticleDTO article,
            BindingResult result
    ) {
        if (result.hasErrors())
            return renderEditForm(articleId, article);

        article.setArticleId(articleId);
        articleService.edit(article);

        return "redirect:/articles";
    }

}