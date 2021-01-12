package com.boxe.cadwarboxe.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@Data
@Entity
@Immutable
@Table(name = "planos")

public class Plano implements Serializable {

    private static final long serialVersionUID = 1L;

    // Mapemanto de classes

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_contratos")
    private Contrato contrato;

    @ManyToOne
    @JoinColumn(name = "id_modalidades")
    private Modalidade modalidades;

    @Id
    @Column(name = "id_planos")
    private Long idPlano;

    @Column(name = "tipo_plano")
    private String tipoPlano;

    @Column(name = "plano_descricao")
    private String planoDescricao;

    public Plano() {
    }

    public Plano(Long idPlano, String tipoPlano, String planoDescricao) {
        this.idPlano = idPlano;
        this.tipoPlano = tipoPlano;
        this.planoDescricao = planoDescricao;
    }

}
