package com.boxe.cadwarboxe.services;

import com.boxe.cadwarboxe.domain.Modalidade;

import org.springframework.stereotype.Service;


@Service
public interface ModalidadeService {

    public Modalidade buscarModalidadePorId(Long id);
    public void deletarModalidadePorId(Long id);
    public Modalidade novaModalidade(Modalidade modalidade);
    public Modalidade atualizarModalidadePorId(Modalidade modalidade);

       

}
