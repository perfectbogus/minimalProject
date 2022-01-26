package dev.perfectbogus.minimalproject.integration.compositeKeys;

import dev.perfectbogus.minimalproject.domain.*;
import dev.perfectbogus.minimalproject.repositories.AccountRepository;
import dev.perfectbogus.minimalproject.repositories.FamilyRepository;
import dev.perfectbogus.minimalproject.repositories.ListFamilyRepository;
import dev.perfectbogus.minimalproject.repositories.PayloadRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Set;

@SpringBootTest
public class CompositeKeyTests {

    @Autowired
    private ListFamilyRepository listFamilyRepository;

    @Test
    public void simpleTest(){

        ListFamily lFamily = listFamilyRepository.getListFamilyByAccountIdAndPayloadIdAndFamilyId(1L, 1L, 1L);

        System.out.println(lFamily.getName());

        System.out.println(lFamily.getFamilyEntity().getName());
        System.out.println(lFamily.getAccountEntity().getName());
        System.out.println(lFamily.getPayloadEntity().getName());

        lFamily.getListCategorySet().forEach(System.out::println);
        //payload1.getFamilySet().forEach(System.out::println);

//        Family newFamily = new Family();
//        newFamily.setName("Family One");
//
//        familyRepository.save(newFamily);
//
//        Payload newPayload = new Payload();
//        newPayload.setName("Payload One");
//
//        payloadRepository.save(newPayload);
//
//        Account newAccount = new Account();
//        newAccount.setName("Account One");
//
//        accountRepository.save(newAccount);





    }
}
