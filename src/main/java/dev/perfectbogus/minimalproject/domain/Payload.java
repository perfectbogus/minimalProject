package dev.perfectbogus.minimalproject.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "PAYLOAD")
@Getter
@Setter
@ToString
public class Payload {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @ToString.Exclude
    @OneToMany(mappedBy = "payloadEntity")
    private List<ListFamily> listFamilyEntities;

}
