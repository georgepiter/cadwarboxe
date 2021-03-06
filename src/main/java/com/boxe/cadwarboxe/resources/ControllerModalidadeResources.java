package com.boxe.cadwarboxe.resources;

import java.net.URI;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.boxe.cadwarboxe.domain.Modalidade;
import com.boxe.cadwarboxe.dto.ModalidadeDto;
import com.boxe.cadwarboxe.services.ModalidadeService;

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
@RequestMapping(value = "/modadlidades")

public class ControllerModalidadeResources {

    @Autowired
    private ModalidadeService modalidadeService;

    @PersistenceContext
    private EntityManager manager;


    // @Autowired
    // private ModalidadesRepository modalidadesRepository;
      
           
    @PostMapping
    public ResponseEntity<Modalidade> novaModalidade(@RequestBody Modalidade modalidade) {
        modalidade = modalidadeService.novaModalidade(modalidade);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(modalidade.getIdModalidade()).toUri();
        return ResponseEntity.created(uri).body(modalidade);
    }

    @GetMapping("/{id}")
    public ModalidadeDto modalidadeDto(@PathVariable Long id) {
        Modalidade modalidade = this.modalidadeService.buscarModalidadePorId(id);

        return new ModalidadeDto(modalidade);
    } 

    @PutMapping("/{id}")
    public ResponseEntity<Void> atualizarModalidadePorId(@RequestBody Modalidade modalidade, @PathVariable Long id) {
        modalidade.setIdModalidade(id);
        modalidade = modalidadeService.atualizarModalidadePorId(modalidade);

        return ResponseEntity.noContent().build();

    }  

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteModalidade(@PathVariable Long id) {
        modalidadeService.deletarModalidadePorId(id);

        return ResponseEntity.ok().build();
    }
    


}