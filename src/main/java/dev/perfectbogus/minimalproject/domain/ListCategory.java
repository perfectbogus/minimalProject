package dev.perfectbogus.minimalproject.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "LIST_CATEGORY")
@Setter
@Getter
@IdClass(ListCategoryId.class)
@ToString
public class ListCategory {

    @Id
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "PAYLOAD_ID"),
            @JoinColumn(name = "ACCOUNT_ID"),
            @JoinColumn(name = "FAMILY_ID")
    })
    private ListFamily listFamilyEntity;

    @Id
    @ManyToOne
    @JoinColumn(name = "CATEGORY_ID", insertable = false, updatable = false)
    private Category categoryEntity;



}
