package com.boxe.cadwarboxe.resources;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.boxe.cadwarboxe.domain.Plano;
import com.boxe.cadwarboxe.dto.PlanoDto;
import com.boxe.cadwarboxe.services.PlanoService;

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

@CrossOrigin(origins = "*")
@RestController
@Component
@RequestMapping(value = "/planos")
public class ControllerPlanosResources {
     
    @Autowired
    private PlanoService planoService;

    @PersistenceContext
    private EntityManager manager;

    // @Autowired
    // private PlanosRepository planosRepository;

    @PostMapping
    public ResponseEntity<Plano> novoPlano(@RequestBody Plano plano) {
        plano = planoService.novoPlano(plano);
        return ResponseEntity.ok().body(plano);

    }

    @GetMapping("/{id}")
    public PlanoDto planosDto(@PathVariable Long id) {
        Plano plano = this.planoService.buscarPlanoPorId(id);

        return new PlanoDto(plano);
    }   
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletePlano(@PathVariable Long id) {
        planoService.deletarPlanoPorId(id);


        return ResponseEntity.ok().build();


    }


}
