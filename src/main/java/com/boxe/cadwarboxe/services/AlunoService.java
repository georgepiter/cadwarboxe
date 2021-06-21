package com.boxe.cadwarboxe.services;

import java.util.List;

import com.boxe.cadwarboxe.domain.Aluno;

import org.springframework.stereotype.Service;
@Service
public interface AlunoService {

	public Aluno buscarAlunoPorId(Long id);
	public void deleteAlunoPorId(Long id);
	public List<Aluno> findAll();
	public Aluno novoAluno(Aluno aluno);
	public Aluno atualizarAlunoPorId(Aluno aluno);

}

   

