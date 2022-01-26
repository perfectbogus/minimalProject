package dev.perfectbogus.minimalproject.repositories;

import dev.perfectbogus.minimalproject.domain.Family;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FamilyRepository extends JpaRepository<Family, Long> {
}
