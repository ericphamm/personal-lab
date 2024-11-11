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
