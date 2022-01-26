package dev.perfectbogus.minimalproject.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "LIST_CATEGORY")
@Setter
@Getter
@IdClass(ListCategoryId.class)
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

}
