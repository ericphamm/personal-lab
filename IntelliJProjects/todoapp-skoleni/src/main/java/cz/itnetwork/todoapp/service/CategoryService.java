package cz.itnetwork.todoapp.service;

import cz.itnetwork.todoapp.dto.CategoryDTO;
import cz.itnetwork.todoapp.entity.CategoryEntity;
import cz.itnetwork.todoapp.entity.repository.CategoryRepository;
import cz.itnetwork.todoapp.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Autowired
    private CategoryRepository categoryRepository;

    //metoda pro ziskani zaznamu
    public List<CategoryDTO> getAll() {
        return categoryRepository.findAll()
                .stream()
                .map(item -> categoryMapper.toDTO(item))
                .toList();
    }
    //metoda na vytvareni zaznamu
    public CategoryDTO create(CategoryDTO categoryDTO) {
        CategoryEntity categoryEntity = categoryMapper.toEntity(categoryDTO);
        categoryEntity = categoryRepository.save(categoryEntity);
        return categoryMapper.toDTO(categoryEntity);
    }

}
