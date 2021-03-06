package com.boxe.cadwarboxe.services.imp;

import com.boxe.cadwarboxe.domain.Plano;
import com.boxe.cadwarboxe.repositories.PlanosRepository;
import com.boxe.cadwarboxe.services.PlanoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultaPlanoServiceImp implements PlanoService {

    @Autowired
    private PlanosRepository planosReposirory;

    @Override
    public Plano buscarPlanoPorId(Long id) {

        return planosReposirory.findById(id).orElseThrow(() -> new RuntimeException("Plano não encontrado"));
    }

    @Override
    public void deletarPlanoPorId(Long id) {
        

    }

    @Override
    public Plano novoPlano(Plano plano) {
        return planosReposirory.save(plano);
    }

    
}
