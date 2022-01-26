package dev.perfectbogus.minimalproject.repositories;

import dev.perfectbogus.minimalproject.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
}
