package com.boxe.cadwarboxe.services.imp;

import com.boxe.cadwarboxe.domain.Contrato;
import com.boxe.cadwarboxe.repositories.ContratoRepository;
import com.boxe.cadwarboxe.services.ContratoService;
import com.boxe.cadwarboxe.services.exception.DataIntegrityException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@Service
public class ConsultaContratoServiceImp implements ContratoService {

    @Autowired
    private ContratoRepository contratoRepository;

    @Override
    public Contrato novoContrato(Contrato contrato) {
        
        return contratoRepository.save(contrato);
    }

    @Override
    public Contrato buscarContratoPorId(Long id) {
        return contratoRepository.findById(id).orElseThrow(() -> new RuntimeException("Contrato não encontrato"));
    }


    @Override
    public void deleteContratoPorId(Long id) {
        buscarContratoPorId(id);
        try {
             contratoRepository.deleteById(id);
        } 
        catch  (DataIntegrityViolationException e) {
            throw new DataIntegrityException("Não é possível excluir um contrato que possui Aluno");

        }
        
    }

    

   
    
}
