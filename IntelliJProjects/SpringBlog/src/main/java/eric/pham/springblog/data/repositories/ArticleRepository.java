package eric.pham.springblog.data.repositories;

import eric.pham.springblog.data.entities.ArticleEntity;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<ArticleEntity, Long> {
}
