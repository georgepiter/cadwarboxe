package com.boxe.cadwarboxe.services.imp;

import java.util.List;
import java.util.Optional;

import com.boxe.cadwarboxe.domain.Aluno;
import com.boxe.cadwarboxe.repositories.AlunosRepository;
import com.boxe.cadwarboxe.services.AlunoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultaAlunoServiceImpl implements AlunoService {

    @Autowired
    private AlunosRepository alunosRepository;

    @Override
    public Aluno buscarAlunoPorId(Long ID) {
        Optional<Aluno> aluno = alunosRepository.findById(ID);      
        return alunosRepository.findById(ID).orElseThrow(() -> new RuntimeException("Aluno não existente"));
      
   }

    @Override
    public List<Aluno> findAll() {       
        return alunosRepository.findAll();
    }

    @Override
    public void deleteAlunoPorID(Long ID) {
      alunosRepository.delete(alunosRepository.findById(ID).get());  

    }

    @Override
    public Aluno novoAluno(Aluno aluno) {
        return alunosRepository.save(aluno);
        
    }

    @Override
    public Aluno atualizarAlunoPorID(Aluno aluno) {
        buscarAlunoPorId(aluno.getIdAlunos());
        return alunosRepository.save(aluno);
    }


   
    }


    

    
    
   

