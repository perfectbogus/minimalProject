package dev.perfectbogus.minimalproject.domain;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "CATEGORY")
@Setter
@Getter
@ToString
public class Category {

    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @ToString.Exclude
    @OneToMany(mappedBy = "categoryEntity")
    private Set<ListCategory> listCategory;

}
