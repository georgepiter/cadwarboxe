package com.boxe.cadwarboxe.services;

import com.boxe.cadwarboxe.domain.Modalidade;

import org.springframework.stereotype.Service;


@Service
public interface ModalidadeService {

    public Modalidade buscarModalidadePorId(Long ID);

    public void deletarModalidadePorId(Long ID);

    public Modalidade novaModalidade(Modalidade modalidade);
       

}
