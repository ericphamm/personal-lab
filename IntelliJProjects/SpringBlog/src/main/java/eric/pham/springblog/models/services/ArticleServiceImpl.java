package eric.pham.springblog.models.services;

import eric.pham.springblog.data.entities.ArticleEntity;
import eric.pham.springblog.data.repositories.ArticleRepository;
import eric.pham.springblog.models.ArticleDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl  implements  ArticleService{

    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public void create(ArticleDTO article) {
        ArticleEntity newArticle = new ArticleEntity();

        // Tuto část později nahradíme tzv. mapperem
        newArticle.setTitle(article.getTitle());
        newArticle.setContent(article.getContent());
        newArticle.setDescription(article.getDescription());

        articleRepository.save(newArticle);
    }
}
