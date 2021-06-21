package com.boxe.cadwarboxe.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import com.boxe.cadwarboxe.domain.Contrato;
import com.fasterxml.jackson.annotation.JsonInclude;

import org.springframework.transaction.annotation.Transactional;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Transactional
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ContratoDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idContratos;
    private String status;
    private Double meses;
    private Date inicioContrato;
    private Date fimContrato;
    private Integer valorTotalContrato;
    private Integer valorMensalidade;

    private List<HistoricoPgtDto> historicoPgt = new ArrayList<>();

    public ContratoDto(Contrato contratoDtoObj) {

        idContratos = contratoDtoObj.getIdContratos();
        status = contratoDtoObj.getStatus();
        meses = contratoDtoObj.getMeses();
        inicioContrato = contratoDtoObj.getInicioContrato();
        fimContrato = contratoDtoObj.getFimContrato();
        valorTotalContrato = contratoDtoObj.getValorTotalContrato();
        valorMensalidade = contratoDtoObj.getValorMensalidade();

        this.historicoPgt = contratoDtoObj.getHistoricoPgt().stream().map(e -> new HistoricoPgtDto(e)).collect(Collectors.toList());

    }

}
