package dev.perfectbogus.minimalproject.domain;

import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class ListCategoryId implements Serializable {

    private Long payloadId;
    private Long accountId;
    private Long familyId;
    private Long categoryId;

}
