package dev.perfectbogus.minimalproject.domain;

import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class ListCategoryId implements Serializable {

    private ListFamily listFamilyEntity;
    private Category categoryEntity;

}
