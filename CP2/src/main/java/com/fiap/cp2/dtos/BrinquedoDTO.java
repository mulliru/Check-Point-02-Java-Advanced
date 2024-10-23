package com.fiap.cp2.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class BrinquedoDTO {

    private Integer id;

    @NotBlank(message = "O nome do brinquedo não pode estar em branco")
    @Size(max = 80, message = "O nome do brinquedo não pode ter mais que 80 caracteres")
    private String nome;

    @NotBlank(message = "O tipo do brinquedo não pode estar em branco")
    @Size(max = 50, message = "O tipo do brinquedo não pode ter mais que 50 caracteres")
    private String tipo;

    @NotBlank(message = "A classificação do brinquedo não pode estar em branco")
    @Size(max = 30, message = "A classificação do brinquedo não pode ter mais que 30 caracteres")
    private String classificacao;

    @NotBlank(message = "O tamanho do brinquedo não pode estar em branco")
    @Size(max = 20, message = "O tamanho do brinquedo não pode ter mais que 20 caracteres")
    private String tamanho;

    @NotNull(message = "O preço do brinquedo é obrigatório")
    @Positive(message = "O preço deve ser maior que zero")
    private Double preco;

    // Construtor padrão
    public BrinquedoDTO() {}

    // Construtor com parâmetros
    public BrinquedoDTO(Integer id, String nome, String tipo, String classificacao, String tamanho, Double preco) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.classificacao = classificacao;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    // Getters e Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
