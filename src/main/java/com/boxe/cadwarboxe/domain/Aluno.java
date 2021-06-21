package com.boxe.cadwarboxe.domain;

import java.io.Serializable;
import java.sql.Blob;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "alunos")

public class Aluno implements Serializable {
	private static final long serialVersionUID = 1L;

	@Transient
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
	private Blob foto;

	@Transient
	public List<Contrato> getContratos() {
		return contratos;
	}

	public void setContratos(List<Contrato> contratos) {
		this.contratos = contratos;
	}

	public Long getIdAlunos() {
		return idAlunos;
	}

	public void setIdAlunos(Long idAlunos) {
		this.idAlunos = idAlunos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getTelefoneFixo() {
		return telefoneFixo;
	}

	public void setTelefoneFixo(String telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getGraduacao() {
		return graduacao;
	}

	public void setGraduacao(String graduacao) {
		this.graduacao = graduacao;
	}

	public Date getDataInscricao() {
		return dataInscricao;
	}

	public void setDataInscricao(Date dataInscricao) {
		this.dataInscricao = dataInscricao;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getIdiomas() {
		return idiomas;
	}

	public void setIdiomas(String idiomas) {
		this.idiomas = idiomas;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getPai() {
		return pai;
	}

	public void setPai(String pai) {
		this.pai = pai;
	}

	public String getMae() {
		return mae;
	}

	public void setMae(String mae) {
		this.mae = mae;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getPraticaEsporte() {
		return praticaEsporte;
	}

	public void setPraticaEsporte(String praticaEsporte) {
		this.praticaEsporte = praticaEsporte;
	}

	public String getSaude() {
		return saude;
	}

	public void setSaude(String saude) {
		this.saude = saude;
	}

	public String getConvenio() {
		return convenio;
	}

	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}

	public String getPraticaArte() {
		return praticaArte;
	}

	public void setPraticaArte(String praticaArte) {
		this.praticaArte = praticaArte;
	}

	public Blob getFoto() {
		return foto;
	}

	public void setFoto(Blob foto) {
		this.foto = foto;
	}

	public Aluno() {
	}

	public Aluno(Long idAlunos, String nome, Integer idade, String rg, Date dataNasc, String email,
				 String celular, String telefoneFixo, String endereco, String bairro, String graduacao,
				 Date dataInscricao, String cep, String profissao, String idiomas, String cpf, String estadoCivil,
				 String pai, String mae, String cidade, String praticaEsporte, String saude, String convenio, String praticaArte, Blob foto) {
		this.idAlunos = idAlunos;
		this.nome = nome;
		this.idade = idade;
		this.rg = rg;
		this.dataNasc = dataNasc;
		this.email = email;
		this.celular = celular;
		this.telefoneFixo = telefoneFixo;
		this.endereco = endereco;
		this.bairro = bairro;
		this.graduacao = graduacao;
		this.dataInscricao = dataInscricao;
		this.cep = cep;
		this.profissao = profissao;
		this.idiomas = idiomas;
		this.cpf = cpf;
		this.estadoCivil = estadoCivil;
		this.pai = pai;
		this.mae = mae;
		this.cidade = cidade;
		this.praticaEsporte = praticaEsporte;
		this.saude = saude;
		this.convenio = convenio;
		this.praticaArte = praticaArte;
		this.foto = foto;
	}
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Aluno aluno = (Aluno) o;
		return idAlunos.equals(aluno.idAlunos) && nome.equals(aluno.nome) && dataNasc.equals(aluno.dataNasc) && cpf.equals(aluno.cpf) && mae.equals(aluno.mae);
	}
	@Override
	public int hashCode() {
		return Objects.hash(idAlunos, nome, dataNasc, cpf, mae);
	}
	@Override
	public String toString() {
		return "Aluno{" +
				"contratos=" + contratos +
				", idAlunos=" + idAlunos +
				", nome='" + nome + '\'' +
				", idade=" + idade +
				", rg='" + rg + '\'' +
				", dataNasc=" + dataNasc +
				", email='" + email + '\'' +
				", celular='" + celular + '\'' +
				", telefoneFixo='" + telefoneFixo + '\'' +
				", endereco='" + endereco + '\'' +
				", bairro='" + bairro + '\'' +
				", graduacao='" + graduacao + '\'' +
				", dataInscricao=" + dataInscricao +
				", cep='" + cep + '\'' +
				", profissao='" + profissao + '\'' +
				", idiomas='" + idiomas + '\'' +
				", cpf='" + cpf + '\'' +
				", estadoCivil='" + estadoCivil + '\'' +
				", pai='" + pai + '\'' +
				", mae='" + mae + '\'' +
				", cidade='" + cidade + '\'' +
				", praticaEsporte='" + praticaEsporte + '\'' +
				", saude='" + saude + '\'' +
				", convenio='" + convenio + '\'' +
				", praticaArte='" + praticaArte + '\'' +
				", foto=" + foto +
				'}';
	}
}
