package dev.perfectbogus.minimalproject.integration.compositeKeys;

import dev.perfectbogus.minimalproject.domain.*;
import dev.perfectbogus.minimalproject.repositories.AccountRepository;
import dev.perfectbogus.minimalproject.repositories.FamilyRepository;
import dev.perfectbogus.minimalproject.repositories.ListFamilyRepository;
import dev.perfectbogus.minimalproject.repositories.PayloadRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class CompositeKeyTests {

    @Autowired
    private ListFamilyRepository listFamilyRepository;

    private ListFamily listFamilyEntity;

    @BeforeEach
    public void setUp(){
        listFamilyEntity = listFamilyRepository.getListFamilyByAccountEntity_IdAndPayloadEntity_IdAndFamilyEntity_Id(1L, 1L, 1L);
    }

    @Test
    public void notNullListFamilyEntity(){
        System.out.println(listFamilyEntity.toString());
        assertNotNull(listFamilyEntity);
    }

    @Test
    public void notNullListCategoryEntities() {
        assertNotNull(listFamilyEntity.getListCategoryEntities());
    }



}
