package com.scn.pos.category;


import com.scn.pos.subcategory.Subcategory;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

import java.util.HashSet;
import java.util.Set;

@Data
@Getter
@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // This annotation is used to specify how the primary key of an entity should be generated.GenerationType.IDENTITY: The database generates the primary key value automatically (e.g., using an auto-increment column). This is the default strategy.
    private Short categoryId;
    @Column(name = "name", nullable = false, length = 100)
    private String name;


    @OneToMany(mappedBy = "category")
    private Set<Subcategory> subcategories = new HashSet<>();

    public Category(){}

    public Category(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", name='" + name + '\'' +
                '}';
    }
}
