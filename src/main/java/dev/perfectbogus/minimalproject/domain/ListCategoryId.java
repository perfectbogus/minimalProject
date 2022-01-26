package dev.perfectbogus.minimalproject.domain;

import lombok.*;

import javax.persistence.Embeddable;

@Embeddable
@Setter
@Getter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class ListCategoryId {

    private Long payloadId;
    private Long accountId;
    private Long catFamilyId;
    private Long categoryId;

}
