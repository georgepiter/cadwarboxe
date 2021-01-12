package com.boxe.cadwarboxe.services.imp;

import com.boxe.cadwarboxe.domain.Contrato;
import com.boxe.cadwarboxe.repositories.ContratoRepository;
import com.boxe.cadwarboxe.services.ContratoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultaContratoServiceImp implements ContratoService {

    @Autowired
    private ContratoRepository contratoRepository;

    @Override
    public Contrato buscarContratoPorId(Long ID) {
        return contratoRepository.findById(ID).orElseThrow(() -> new RuntimeException("Contrato não encontrato"));
    }

    @Override
    public void deleteContratoPorId(Long ID) {

    }

    @Override
    public Contrato novoContrato(Contrato contrato) {
        return contratoRepository.save(contrato);
    }
    
}
