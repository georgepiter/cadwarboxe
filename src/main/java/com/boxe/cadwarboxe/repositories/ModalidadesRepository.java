package com.boxe.cadwarboxe.repositories;

import java.util.Optional;
import com.boxe.cadwarboxe.domain.Modalidade;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ModalidadesRepository extends JpaRepository<Modalidade, Long> {

    public Optional<Modalidade> findById(Long id);

}

