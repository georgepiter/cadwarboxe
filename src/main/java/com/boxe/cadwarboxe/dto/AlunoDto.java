package com.boxe.cadwarboxe.dto;

import java.io.Serializable;
import java.sql.Blob;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.constraints.NotEmpty;
import com.boxe.cadwarboxe.domain.Aluno;
import com.fasterxml.jackson.annotation.JsonInclude;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
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

    
}