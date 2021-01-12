package com.boxe.cadwarboxe.domain;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Immutable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Immutable
@Table(name = "contratos")

public class Contrato implements Serializable {

    private static final long serialVersionUID = 1L;

    // Mapemanto de classes

    @ManyToOne
    @JoinColumn(name = "id_alunos")
    private Aluno alunos;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "contrato")
    private List<HistoricoPgt> historicoPgts = new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "contrato")
    private Plano planos;

    @Id
    @Column(name = "id_contratos")
    private Long idContratos;

    @Column(name = "status")
    private String status;

    @Column(name = "quantidade_meses")
    private Double meses;

    @Column(name = "data_inicio_contrato")
    private Date inicioContrato;

    @Column(name = "data_fim_contrato")
    private Date fimContrato;

    @Column(name = "valor_contrato")
    private Integer valorTotalContrato;

    @Column(name = "valor_mensalidade")
    private Integer valorMensalidade;

    public Contrato(Long idContratos, String status, Double meses, Date inicioContrato, Date fimContrato,
            Integer valorTotalContrato, Integer valorMensalidade) {
        this.idContratos = idContratos;
        this.status = status;
        this.meses = meses;
        this.inicioContrato = inicioContrato;
        this.fimContrato = fimContrato;
        this.valorTotalContrato = valorTotalContrato;
        this.valorMensalidade = valorMensalidade;
    }
  
    public Aluno getAlunos() {
        return alunos;
    }

    public List<HistoricoPgt> getHistoricoPgt() {
        return historicoPgts;
    }
    
    public void setHistoricoPgt(List<HistoricoPgt> historicoPgts) {
		this.historicoPgts = historicoPgts;
	}
   
}
