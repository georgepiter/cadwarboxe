package com.boxe.cadwarboxe.domain;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "historico_pgt")

public class HistoricoPgt implements Serializable {

    private static final long serialVersionUID = 1L;

    // Mapemanto de classes

    @ManyToOne
    @JoinColumn(name = "id_contratos")
    private Contrato contrato;

    @Id
    @Column(name = "id_historico_pgt")
    private Long idHistorico;

    @Column(name = "mes")
    private Integer mes;

    @Column(name = "ano")
    private String ano;

    @Column(name = "valor")
    private String valor;

    @Column(name = "data_vencimento")
    private Date dataVencimento;

    @Column(name = "data_pagamento")
    private Date dataPagamento;

    @Column(name = "valor_pago")
    private Integer valorPago;

    public HistoricoPgt(Long idHistorico, Integer mes, String ano, String valor, 
                        Date dataVencimento, Date dataPagamento, Integer valorPago) {
                        this.idHistorico = idHistorico;
                        this.mes = mes;
                        this.ano = ano;
                        this.valor = valor;
                        this.dataVencimento = dataVencimento;
                        this.valorPago = valorPago;
    }

}