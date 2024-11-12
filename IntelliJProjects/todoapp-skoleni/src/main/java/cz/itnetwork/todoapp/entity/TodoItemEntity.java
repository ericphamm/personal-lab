package cz.itnetwork.todoapp.entity;

import jakarta.persistence.*;

@Entity
public class TodoItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    strategy rikame jak name budou generovat identity
    @Column(nullable = false)
    private Long id;

    private String name;


    @ManyToOne
    private CategoryEntity categoryEntity;

    //vlastni getter pro ziskani id z entity kategrorie
    public Long getCategoryId() {
        if (this.categoryEntity == null)
            return null;
        return this.categoryEntity.getId();
    }

    public void setCategoryEntity(CategoryEntity categoryEntity) {
        this.categoryEntity = categoryEntity;
    }



    public Long getId() {
        return id;
    }

//getery and settery
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
