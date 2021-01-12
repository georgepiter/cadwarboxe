package com.boxe.cadwarboxe.resources;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.boxe.cadwarboxe.domain.Aluno;
import com.boxe.cadwarboxe.dto.AlunoDto;
import com.boxe.cadwarboxe.repositories.AlunosRepository;
import com.boxe.cadwarboxe.services.AlunoService;
import com.boxe.cadwarboxe.services.imp.ConsultaAlunoServiceImpl;

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
    private AlunoService alunoService;  
    
    @PersistenceContext
    private EntityManager manager;

    @Autowired
    private AlunosRepository alunosRepository;

    @GetMapping("/{ID}")
    public AlunoDto alunosDtos(@PathVariable Long ID) {
        Aluno aluno = this.alunoService.buscarAlunoPorId(ID);

        return new AlunoDto(aluno);
    }

    @GetMapping("/")
    public List<AlunoDto> listAlunos() {
        // alunoService.findAll().stream().map(e -> AlunoDto.builder().nome(e.getNome()).build()).collect(Collectors.toList());

        return alunoService.findAll().stream().map(e -> AlunoDto.builder().nome(e.getNome()).build()).collect(Collectors.toList());        
    }

    @PostMapping
    public ResponseEntity<Aluno> novoAluno(@RequestBody Aluno aluno) {
        aluno = alunoService.novoAluno(aluno);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(aluno.getIdAlunos()).toUri();
        return ResponseEntity.created(uri).body(aluno);        
    }


     
    @PutMapping("/{ID}")
    public ResponseEntity<Void> atualizarAluno(@RequestBody Aluno aluno) {        
        return ResponseEntity.noContent().build();   
    }
 



    @DeleteMapping("/{ID}")
    public ResponseEntity<?> deleteAluno(@PathVariable Long ID) {
        alunoService.deleteAlunoPorID(ID);

        return ResponseEntity.ok().build();

    }
}