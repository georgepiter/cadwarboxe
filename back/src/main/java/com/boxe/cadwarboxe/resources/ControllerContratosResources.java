package com.boxe.cadwarboxe.resources;

import java.net.URI;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.boxe.cadwarboxe.domain.Contrato;
import com.boxe.cadwarboxe.dto.ContratoDto;
import com.boxe.cadwarboxe.services.ContratoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@CrossOrigin(origins = "*")
@RestController
@Component
@RequestMapping(value = "/contratos")
public class ControllerContratosResources {

    @Autowired
    private ContratoService contratoService;

    @PersistenceContext
    private EntityManager manager;

    // @Autowired
    // private ContratoRepository contratoRepository;

    @GetMapping("/{id}")
    public ContratoDto contratoDto(@PathVariable Long id) {
        Contrato contrato = this.contratoService.buscarContratoPorId(id);

        return new ContratoDto(contrato);

    }

    @PostMapping
    public ResponseEntity<Contrato> novoContrato(@RequestBody Contrato contrato) {
        contrato = contratoService.novoContrato(contrato);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(contrato.getIdContratos()).toUri();
        return ResponseEntity.created(uri).body(contrato);
    }

    // Não funciona pq precisa deletar o id plano antes
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteContrato(@PathVariable Long id) {
        contratoService.deleteContratoPorId(id);

        return ResponseEntity.ok().build();

    }

}