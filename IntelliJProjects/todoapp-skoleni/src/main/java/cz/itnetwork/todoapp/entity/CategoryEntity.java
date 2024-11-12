package cz.itnetwork.todoapp.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class CategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "categoryEntity")
    private List <TodoItemEntity> items;

    //gettery and settery


    public List<TodoItemEntity> getItems() {
        return items;
    }

    public void setItems(List<TodoItemEntity> items) {
        this.items = items;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
