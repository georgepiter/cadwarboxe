package com.boxe.cadwarboxe.dto;

import java.io.Serializable;

import com.boxe.cadwarboxe.domain.Plano;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)

public class PlanoDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idPlano;
    private String tipoPlano;
    private String planoDescricao;
    
    public PlanoDto(Plano planoDtoObj) {

        idPlano = planoDtoObj.getIdPlano();
        tipoPlano = planoDtoObj.getTipoPlano();
        planoDescricao = planoDtoObj.getPlanoDescricao();
    }

}