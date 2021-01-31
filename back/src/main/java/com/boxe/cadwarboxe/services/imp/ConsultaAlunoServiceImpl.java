package com.boxe.cadwarboxe.services.imp;

import java.util.List;
import java.util.Optional;

import com.boxe.cadwarboxe.domain.Aluno;
import com.boxe.cadwarboxe.repositories.AlunosRepository;
import com.boxe.cadwarboxe.services.AlunoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class ConsultaAlunoServiceImpl implements AlunoService {

    @Autowired
    private AlunosRepository alunosRepository;

    @Override
    public Aluno novoAluno(Aluno aluno) {
        aluno.setIdAlunos(null);
        return alunosRepository.save(aluno);

    }

    @Override
    public List<Aluno> findAll() {
        return alunosRepository.findAll();
    }

    @Override
    public Aluno buscarAlunoPorId(Long id) {
        Optional<Aluno> aluno = alunosRepository.findById(id);
        if (aluno == null) {
            try {
                throw new ObjectNotFoundException(
                        "Objeto não encontrado! Id: " + id + ", Tipo: " + Aluno.class.getName());
            } catch (ObjectNotFoundException e) {
                e.printStackTrace();
            }
        }
        return alunosRepository.findById(id).orElseThrow(() -> new RuntimeException("Aluno não existente"));

    }

    @Override
    public Aluno atualizarAlunoPorId(Aluno aluno) {
        buscarAlunoPorId(aluno.getIdAlunos());
        
        return alunosRepository.save(aluno);
    }

    @Override
    public void deleteAlunoPorId(Long id) {
        buscarAlunoPorId(id);
        alunosRepository.delete(alunosRepository.findById(id).get());

    }

}
