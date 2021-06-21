package com.boxe.cadwarboxe.repositories;

import java.util.Optional;

import com.boxe.cadwarboxe.domain.HistoricoPgt;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface HistoricoPgtRepository extends JpaRepository<HistoricoPgt, Long> {

    public Optional<HistoricoPgt> findById(Long idHistorico);
    
}


