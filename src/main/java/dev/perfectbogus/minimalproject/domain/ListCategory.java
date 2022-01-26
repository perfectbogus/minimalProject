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
    @Column(name = "PAYLOAD_ID")
    private Long payloadId;

    @Id
    @Column(name = "ACCOUNT_ID")
    private Long accountId;

    @Id
    @Column(name = "FAMILY_ID")
    private Long familyId;

    @Id
    @Column(name = "CATEGORY_ID")
    private Long categoryId;

    @ToString.Exclude
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "PAYLOAD_ID", updatable = false, insertable = false),
            @JoinColumn(name = "ACCOUNT_ID", updatable = false, insertable = false),
            @JoinColumn(name = "FAMILY_ID", updatable = false, insertable = false)
    })
    private ListFamily listFamily;

    @ManyToOne
    @JoinColumn(name = "CATEGORY_ID", updatable = false, insertable = false)
    private Category category;

}
