package com.boxe.cadwarboxe.repositories;

import java.util.Optional;
import com.boxe.cadwarboxe.domain.Aluno;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunosRepository extends JpaRepository<Aluno, Long> {

    public Optional<Aluno> findById(Long idAlunos);
  
}
