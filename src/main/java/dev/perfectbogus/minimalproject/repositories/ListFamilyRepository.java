package dev.perfectbogus.minimalproject.repositories;

import dev.perfectbogus.minimalproject.domain.ListFamily;
import dev.perfectbogus.minimalproject.domain.ListFamilyId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListFamilyRepository extends JpaRepository<ListFamily, ListFamilyId> {

    ListFamily getListFamilyByAccountIdAndPayloadIdAndFamilyId(Long accountId, Long payloadId, Long familyId);

}


