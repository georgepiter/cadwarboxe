package com.boxe.cadwarboxe.resources;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.Valid;

import com.boxe.cadwarboxe.domain.Aluno;
import com.boxe.cadwarboxe.dto.AlunoDto;
import com.boxe.cadwarboxe.services.AlunoService;
import com.boxe.cadwarboxe.services.imp.ConsultaAlunoServiceImpl;

import org.aspectj.apache.bcel.generic.SwitchBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@CrossOrigin(origins = "*")
@RestController
@Component
@RequestMapping(value = "/alunos")
public class ControllerAlunoResources {

    @Autowired
    private ConsultaAlunoServiceImpl consultaAlunoServiceImpl;

    @Autowired
    private AlunoService alunoService;

    @PersistenceContext
    private EntityManager manager;

    @PostMapping
    public ResponseEntity<Aluno> novoAluno(@Valid @RequestBody Aluno aluno) {
        aluno = consultaAlunoServiceImpl.novoAluno(aluno);
        aluno.setIdAlunos(null);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(aluno.getIdAlunos())
                .toUri();
        return ResponseEntity.created(uri).build();
    }

    // preencher o DTO para / valition funcionando pelo DTO

    @GetMapping("/{id}")
    public AlunoDto alunosDtos(@PathVariable Long id) {
        Aluno aluno = this.alunoService.buscarAlunoPorId(id);

        return new AlunoDto(aluno);
    }

    @GetMapping("/")
    public List<AlunoDto> listAlunos() {
        return alunoService.findAll().stream().map(e -> AlunoDto.builder().nome(e.getNome()).build())
                .collect(Collectors.toList());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Aluno> atualizarAluno(@RequestBody Aluno aluno, @PathVariable Long id) {
        aluno.setIdAlunos(id);
        aluno = alunoService.atualizarAlunoPorId(aluno);

        return ResponseEntity.noContent().build();

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteAluno(@PathVariable Long id) {
        alunoService.deleteAlunoPorId(id);
        return ResponseEntity.noContent().build();

    }
  
}