package dev.perfectbogus.minimalproject.repositories;

import dev.perfectbogus.minimalproject.domain.Quote;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuoteRepository extends CrudRepository<Quote, Long > {
}
