package dev.perfectbogus.minimalproject.domain;

import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@EqualsAndHashCode
@NoArgsConstructor
public class ListFamilyId implements Serializable {

    private Account accountEntity;
    private Payload payloadEntity;
    private Family familyEntity;

}
