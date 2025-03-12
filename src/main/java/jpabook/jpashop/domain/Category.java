package jpabook.jpashop.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Category {
    
    @Id @GeneratedValue
    @Column(name = "category_id")
    private Long id;

    private String name;
    
}
