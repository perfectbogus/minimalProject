package dev.perfectbogus.minimalproject.repositories;

import dev.perfectbogus.minimalproject.domain.Payload;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PayloadRepository extends JpaRepository<Payload, Long> {

    Payload getById(Long id);

    Payload getPayloadById(Long id);

}
