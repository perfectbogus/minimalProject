package dev.perfectbogus.minimalproject.domain;

import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@EqualsAndHashCode
@NoArgsConstructor
public class ListFamilyId implements Serializable {

    private Long payloadId;
    private Long accountId;
    private Long familyId;

}
