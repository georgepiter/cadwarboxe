package com.boxe.cadwarboxe.dto;

import java.io.Serializable;

import com.boxe.cadwarboxe.domain.Modalidade;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)

public class ModalidadeDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idModalidade;
    private String modalidade;
    private Double valorModalidade;

    public ModalidadeDto(Modalidade modalidadeDtoObj) {

        idModalidade = modalidadeDtoObj.getIdModalidade();
        modalidade = modalidadeDtoObj.getModalidade();
        valorModalidade = modalidadeDtoObj.getValorModalidade();


    }


}
