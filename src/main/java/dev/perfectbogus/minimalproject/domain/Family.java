package dev.perfectbogus.minimalproject.domain;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "FAMILY")
@Setter
@Getter
@NoArgsConstructor
@ToString
public class Family {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @ToString.Exclude
    @OneToMany(mappedBy = "familyEntity")
    private List<ListFamily> listFamilyEntities;

}
