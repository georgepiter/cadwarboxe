package com.boxe.cadwarboxe.repositories;

import java.util.Optional;

import com.boxe.cadwarboxe.domain.Contrato;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ContratoRepository extends JpaRepository<Contrato, Long> {

    public Optional<Contrato> findById(Long idContratos);
    
}
