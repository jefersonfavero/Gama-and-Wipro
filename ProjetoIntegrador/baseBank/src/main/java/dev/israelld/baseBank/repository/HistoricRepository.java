package dev.israelld.baseBank.repository;

import dev.israelld.baseBank.model.Historic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoricRepository extends JpaRepository<Historic, Long> {

}
