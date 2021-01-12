package com.boxe.cadwarboxe.domain;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
@Table(name = "alunos")

public class Aluno implements Serializable {

	private static final long serialVersionUID = 1L;

	// Mapemanto de classes

	@OneToMany(mappedBy = "alunos")
	private List<Contrato> contratos = new ArrayList<>();

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_alunos")
	private Long idAlunos;

	@Column(name = "nome")
	private String nome;

	@Column(name = "idade")
	private Integer idade;

	@Column(name = "rg")
	private String rg;

	@Column(name = "dt_nasc")
	private Date dataNasc;

	@Column(name = "email")
	private String email;

	@Column(name = "telef_cel")
	private String celular;

	@Column(name = "telef_resid")
	private String telefoneFixo;

	@Column(name = "endereco")
	private String endereco;

	@Column(name = "bairro")
	private String bairro;

	@Column(name = "graduacao")
	private String graduacao;

	@Column(name = "data_inscricao")
	private Date dataInscricao;

	@Column(name = "cep")
	private String cep;

	@Column(name = "profissao")
	private String profissao;

	@Column(name = "idiomas")
	private String idiomas;

    @Column(name = "cpf")
	private String cpf;

	@Column(name = "estado_civil")
	private String estadoCivil;

	@Column(name = "nome_pai")
	private String pai;

	@Column(name = "nome_mae")
	private String mae;

	@Column(name = "cidade")
	private String cidade;

	@Column(name = "pratica_esporte")
	private String praticaEsporte;

	@Column(name = "problema_saude")
	private String saude;

	@Column(name = "convenio")
	private String convenio;

	@Column(name = "pratica_artemarcial")
	private String praticaArte;

	@Column(name = "foto")
	private String foto;

	public List<Contrato> getContratos() {
		return contratos;
	}

	public void setContratos(List<Contrato> contratos) {
		this.contratos = contratos;
	}

	public void setId(Object object) {
	}
}
