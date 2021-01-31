package com.boxe.cadwarboxe.repositories;

import java.util.Optional;

import com.boxe.cadwarboxe.domain.Plano;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PlanosRepository extends JpaRepository<Plano, Long> {


    public Optional<Plano> findByIdPlano(Long id);
}
