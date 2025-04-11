package eric.pham.springblog.models.services;

import eric.pham.springblog.data.entities.ArticleEntity;
import eric.pham.springblog.data.repositories.ArticleRepository;
import eric.pham.springblog.models.dto.ArticleDTO;
import eric.pham.springblog.models.dto.mappers.ArticleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.StreamSupport;

@Service
public class ArticleServiceImpl  implements  ArticleService{

    @Autowired
    private ArticleRepository articleRepository;

    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public void create(ArticleDTO article) {
        ArticleEntity newArticle = articleMapper.toEntity(article);

        articleRepository.save(newArticle);
    }

    @Override
    public List<ArticleDTO> getAll() {
        return StreamSupport.stream(articleRepository.findAll().spliterator(), false)
                .map(i -> articleMapper.toDTO(i))
                .toList();
    }
}
