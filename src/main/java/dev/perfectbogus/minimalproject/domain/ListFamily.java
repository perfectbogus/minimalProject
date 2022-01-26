package dev.perfectbogus.minimalproject.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "LIST_FAMILY")
@Getter
@Setter
@IdClass(ListFamilyId.class)
public class ListFamily {

    @Id
    @Column(name = "PAYLOAD_ID")
    private Long payloadId;
    @Id
    @Column(name = "ACCOUNT_ID")
    private Long accountId;
    @Id
    @Column(name = "FAMILY_ID")
    private Long familyId;

    @Column(name = "NAME")
    private String name;

    @ManyToOne
    @JoinColumn(name = "PAYLOAD_ID", insertable = false, updatable = false)
    private Payload payloadEntity;

    @ManyToOne
    @JoinColumn(name = "ACCOUNT_ID", insertable = false, updatable = false)
    private Account accountEntity;

    @ManyToOne
    @JoinColumn(name = "FAMILY_ID", insertable = false, updatable = false)
    private Family familyEntity;



}
