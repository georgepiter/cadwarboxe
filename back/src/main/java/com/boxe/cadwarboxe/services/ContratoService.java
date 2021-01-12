package com.boxe.cadwarboxe.services;

import com.boxe.cadwarboxe.domain.Contrato;

import org.springframework.stereotype.Service;

@Service
public interface ContratoService {

    public Contrato buscarContratoPorId(Long ID);
    public void deleteContratoPorId(Long ID);
    public Contrato novoContrato(Contrato contrato);
}
