package com.scn.pos.article;

import com.scn.pos.subcategory.Subcategory;
import jakarta.persistence.*;
import lombok.Data;



import java.math.BigDecimal;

@Data // The @Data annotation in Lombok is a convenient way to automatically generate getters, setters, equals, hashCode, toString, and a few other methods for your Java classes.
@Entity(name = "articles") // is a JPA annotation to make this object ready for storage in a JPA-based data store.
public class Article {
    // In java the standard convention is to use camelCase, this field in SQL should in snake_casing
    // We have to make sure that this id is a primary key, we do it with the next annotation:
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int articleId;
    private String name;
    private BigDecimal price;
    @ManyToOne
    @JoinColumn(name = "subcategory_id")
    private Subcategory subcategory;
}
