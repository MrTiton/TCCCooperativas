package com.titon.projeto.entities;

import org.hibernate.annotations.GenericGenerator;
//import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;
//import java.util.Calendar;


@Entity
@Table(name = "cooperativa")
public class Cooperativa {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Long id;

//    @NotEmpty
    @Size(max = 40)
    @Column(name = "cnpj")
    private String CNPJ;

    @NotEmpty
    @Size(max = 100)
    @Column(name = "pessoajuridicafisica")
    private String pessoaJuridicaFisica;

    @Size(max = 100)
    @Column(name = "razaosocial")
    private String razaoSocial;

    @Size(max = 100)
    @Column(name = "nomefantasia")
    private String nomeFantasia;

    @Size(max = 100)
    private String representante;

    @Column(name = "datacriacao")
    private Date dataCriacao;

    @Size(max = 30)
    private String telefone;

    @Size(max = 100)
    @Column(name = "enderecoRua")
    private String enderecoRua;

    @Size(max = 100)
    @Column(name = "enderecobairro")
    private String enderecoBairro;

    @Size(max = 30)
    @Column(name = "endereconumero")
    private String enderecoNumero;

    @Size(max = 100)
    private String cidade;

    @Size(max = 2)
    private String estado;

    @Column(name = "tipocooperativaid")
    private int tipoCooperativaID;

    @Size(max = 60)
    @Column(name = "tipocooperativa")
    private String tipoCooperativa;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getPessoaJuridicaFisica() {
        return pessoaJuridicaFisica;
    }

    public void setPessoaJuridicaFisica(String pessoaJuridicaFisica) {
        this.pessoaJuridicaFisica = pessoaJuridicaFisica;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEnderecoRua() {
        return enderecoRua;
    }

    public void setEnderecoRua(String enderecoRua) {
        this.enderecoRua = enderecoRua;
    }

    public String getEnderecoBairro() {
        return enderecoBairro;
    }

    public void setEnderecoBairro(String enderecoBairro) {
        this.enderecoBairro = enderecoBairro;
    }

    public String getEnderecoNumero() {
        return enderecoNumero;
    }

    public void setEnderecoNumero(String enderecoNumero) {
        this.enderecoNumero = enderecoNumero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getTipoCooperativaID() {
        return tipoCooperativaID;
    }

    public void setTipoCooperativaID(int tipoCooperativaID) {
        this.tipoCooperativaID = tipoCooperativaID;
    }

    public String getTipoCooperativa() {
        return tipoCooperativa;
    }

    public void setTipoCooperativa(String tipoCooperativa) {
        this.tipoCooperativa = tipoCooperativa;
    }
}

//    CREATE TABLE `cooperativa` (
//        `id` bigint(20) NOT NULL AUTO_INCREMENT,
//        `CNPJ` varchar(20) NOT NULL,
//        `pessoaJuridicaFisica` varchar(20) NOT NULL,
//        `razaoSocial` varchar(100) DEFAULT NULL,
//        `nomeFantasia` varchar(100) DEFAULT NULL,
//        `representante` varchar(100) DEFAULT NULL,
//        `dataCriacao` date DEFAULT NULL,
//        `telefone` varchar(30) DEFAULT NULL,
//        `enderecoRua` varchar(100) DEFAULT NULL,
//        `enderecoBairro` varchar(60) DEFAULT NULL,
//        `enderecoNumero` varchar(30) DEFAULT NULL,
//        `cidade` varchar(100) DEFAULT NULL,
//        `estado` varchar(2) DEFAULT NULL,
//        `tipoCooperativaID` int(11) DEFAULT NULL,
//        `tipoCooperativa` varchar(60) DEFAULT NULL,
//        PRIMARY KEY (`id`)
//        )