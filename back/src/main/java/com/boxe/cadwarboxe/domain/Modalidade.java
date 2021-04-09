package com.boxe.cadwarboxe.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@Data
@Entity
@Table(name = "modalidades")

public class Modalidade implements Serializable {

    private static final long serialVersionUID = 1L;

    // Mapemanto de classes

    @OneToMany(mappedBy = "modalidades")
	private List<Modalidade> modalidades = new ArrayList<>();

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_modalidades")
    private Long idModalidade;

    @Column(name = "nome_modalidade")
    private String modalidade;

    @Column(name = "valor_modalidade")
    private Double valorModalidade;

    public Modalidade() {
    }
        
    public Modalidade(Long idModalidade, String modalidade, Double valorModalidade) {
        this.idModalidade = idModalidade;
        this.modalidade = modalidade;
        this.valorModalidade = valorModalidade;
    }

  
}