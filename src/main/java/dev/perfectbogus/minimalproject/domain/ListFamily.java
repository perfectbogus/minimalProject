package dev.perfectbogus.minimalproject.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "LIST_FAMILY")
@Getter
@Setter
@IdClass(ListFamilyId.class)
@ToString
public class ListFamily {

    @Id
    @ManyToOne
    @JoinColumn(name = "PAYLOAD_ID")
    private Payload payloadEntity;

    @Id
    @ManyToOne
    @JoinColumn(name = "ACCOUNT_ID")
    private Account accountEntity;

    @Id
    @ManyToOne
    @JoinColumn(name = "FAMILY_ID")
    private Family familyEntity;

    @Column(name = "NAME")
    private String name;

    @ToString.Exclude
    @OneToMany(mappedBy = "listFamilyEntity", fetch = FetchType.EAGER)
    private Set<ListCategory> listCategoryEntities;

}
