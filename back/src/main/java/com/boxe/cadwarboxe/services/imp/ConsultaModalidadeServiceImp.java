package com.boxe.cadwarboxe.services.imp;

import com.boxe.cadwarboxe.domain.Modalidade;
import com.boxe.cadwarboxe.repositories.ModalidadesRepository;
import com.boxe.cadwarboxe.services.ModalidadeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultaModalidadeServiceImp implements ModalidadeService {

    @Autowired
    private ModalidadesRepository modalidadesRepository;

    @Override
    public Modalidade buscarModalidadePorId(Long ID) {
        
        return modalidadesRepository.findById(ID).orElseThrow(() -> new RuntimeException("Modalidade não encontrada"));
    }

    @Override
    public void deletarModalidadePorId(Long ID) {

    }

    @Override
    public Modalidade novaModalidade(Modalidade modalidade) {
        return modalidadesRepository.save(modalidade);
       
    
    }

  
   
}
