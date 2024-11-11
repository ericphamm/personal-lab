package cz.itnetwork.todoapp.entity.repository;

import cz.itnetwork.todoapp.entity.TodoItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

// Jpa repo ma 2 attributy, s jakym entitou budou pracovat a s jakym datovym typem ID
public interface TodoItemRepository extends JpaRepository <TodoItemEntity, Long>{

}
