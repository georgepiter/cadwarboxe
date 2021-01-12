package com.boxe.cadwarboxe.dto;

import java.io.Serializable;
import java.sql.Date;

import com.boxe.cadwarboxe.domain.HistoricoPgt;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HistoricoPgtDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idHistorico;
    private Integer mes;
    private String ano;
    private String valor;
    private Date dataVencimento;
    private Integer valorPago;
    private Date dataPagamento;



    public HistoricoPgtDto(HistoricoPgt historicoPgtDtoObj) {

        idHistorico = historicoPgtDtoObj.getIdHistorico();
        mes = historicoPgtDtoObj.getMes();
        ano = historicoPgtDtoObj.getAno();
        valor = historicoPgtDtoObj.getValor();
        dataVencimento = historicoPgtDtoObj.getDataVencimento();
        valorPago = historicoPgtDtoObj.getValorPago();
        dataPagamento = historicoPgtDtoObj.getDataPagamento();
    }


}