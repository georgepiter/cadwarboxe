package com.boxe.cadwarboxe.dto;

import java.io.Serializable;
import java.sql.Blob;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import javax.validation.constraints.NotEmpty;
import com.boxe.cadwarboxe.domain.Aluno;
import com.fasterxml.jackson.annotation.JsonInclude;

import org.hibernate.validator.constraints.Length;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

@JsonInclude(JsonInclude.Include.NON_NULL)

public class AlunoDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long idAlunos;
    @NotEmpty(message = "Nome obrigatório")
    @Length(min=5, max=80, message = "O tamanaho deve ser entre 5 e 80 caracteres")
    private String nome;
    private Integer idade;
    private String rg;
    private Date dataNasc;
    private String email;
    private String celular;
    private String endereco;
    private String bairro;
    private String cep;
    private String teleoneFixo;
    private String graduacao;
    private Date dataInscricao;
    private Blob foto;
    private String profissao;
    private String idiomas;
    private String cpf;
    private String estadoCivil;
    private String pai;
    private String mae;
    private String cidade;
    private String praticaEsporte;
    private String saude;
    private String convenio;
    private String praticaArte;

    private List<ContratoDto> contratos = new ArrayList<>();

    public AlunoDto(Aluno alunoDtoObj) {

        idAlunos = alunoDtoObj.getIdAlunos();
        nome = alunoDtoObj.getNome();
        idade = alunoDtoObj.getIdade();
        rg = alunoDtoObj.getRg();
        dataNasc = alunoDtoObj.getDataNasc();
        email = alunoDtoObj.getEmail();
        celular = alunoDtoObj.getCelular();
        endereco = alunoDtoObj.getEndereco();
        bairro = alunoDtoObj.getBairro();
        cep = alunoDtoObj.getCep();
        teleoneFixo = alunoDtoObj.getTelefoneFixo();
        graduacao = alunoDtoObj.getGraduacao();
        dataInscricao = alunoDtoObj.getDataInscricao();
        foto = alunoDtoObj.getFoto();
        profissao = alunoDtoObj.getProfissao();
        idiomas = alunoDtoObj.getIdiomas();
        cpf = alunoDtoObj.getCpf();
        estadoCivil = alunoDtoObj.getEstadoCivil();
        pai = alunoDtoObj.getPai();
        mae = alunoDtoObj.getMae();
        cidade = alunoDtoObj.getCidade();
        praticaEsporte = alunoDtoObj.getPraticaEsporte();
        saude = alunoDtoObj.getSaude();
        convenio = alunoDtoObj.getConvenio();
        praticaArte = alunoDtoObj.getPraticaArte();

        this.contratos = alunoDtoObj.getContratos().stream().map(e -> new ContratoDto(e)).collect(Collectors.toList());
    }

    public AlunoDto() {
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

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTeleoneFixo() {
        return teleoneFixo;
    }

    public void setTeleoneFixo(String teleoneFixo) {
        this.teleoneFixo = teleoneFixo;
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

    public Blob getFoto() {
        return foto;
    }

    public void setFoto(Blob foto) {
        this.foto = foto;
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

    public List<ContratoDto> getContratos() {
        return contratos;
    }

    public void setContratos(List<ContratoDto> contratos) {
        this.contratos = contratos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlunoDto alunoDto = (AlunoDto) o;
        return idAlunos.equals(alunoDto.idAlunos) && Objects.equals(nome, alunoDto.nome)
                && Objects.equals(idade, alunoDto.idade) && Objects.equals(rg, alunoDto.rg)
                && Objects.equals(dataNasc, alunoDto.dataNasc) && Objects.equals(email, alunoDto.email)
                && Objects.equals(celular, alunoDto.celular) && Objects.equals(endereco, alunoDto.endereco)
                && Objects.equals(bairro, alunoDto.bairro) && Objects.equals(cep, alunoDto.cep)
                && Objects.equals(teleoneFixo, alunoDto.teleoneFixo) && Objects.equals(graduacao, alunoDto.graduacao)
                && Objects.equals(dataInscricao, alunoDto.dataInscricao) && Objects.equals(foto, alunoDto.foto)
                && Objects.equals(profissao, alunoDto.profissao) && Objects.equals(idiomas, alunoDto.idiomas)
                && Objects.equals(cpf, alunoDto.cpf) && Objects.equals(estadoCivil, alunoDto.estadoCivil)
                && Objects.equals(pai, alunoDto.pai) && Objects.equals(mae, alunoDto.mae) && Objects.equals(cidade, alunoDto.cidade)
                && Objects.equals(praticaEsporte, alunoDto.praticaEsporte) && Objects.equals(saude, alunoDto.saude)
                && Objects.equals(convenio, alunoDto.convenio) && Objects.equals(praticaArte, alunoDto.praticaArte)
                && Objects.equals(contratos, alunoDto.contratos);
    }
    @Override
    public int hashCode() {
        return Objects.hash(idAlunos, nome, idade, rg, dataNasc, email, celular, endereco, bairro, cep, teleoneFixo, graduacao,
                dataInscricao, foto, profissao, idiomas, cpf, estadoCivil, pai, mae, cidade, praticaEsporte, saude, convenio, praticaArte, contratos);
    }
    @Override
    public String toString() {
        return "AlunoDto{" +
                "idAlunos=" + idAlunos +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", rg='" + rg + '\'' +
                ", dataNasc=" + dataNasc +
                ", email='" + email + '\'' +
                ", celular='" + celular + '\'' +
                ", endereco='" + endereco + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cep='" + cep + '\'' +
                ", teleoneFixo='" + teleoneFixo + '\'' +
                ", graduacao='" + graduacao + '\'' +
                ", dataInscricao=" + dataInscricao +
                ", foto=" + foto +
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
                ", contratos=" + contratos +
                '}';
    }
}