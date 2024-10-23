package com.fiap.cp2.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
@Table(name = "CP2_BRINQUEDO")
@SequenceGenerator(name = "brinq", sequenceName = "SQ_CP2_BRINQUEDO", allocationSize = 1)


public class Brinquedo {
	
	@Id
	@Column(name = "id_brinquedo")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "brinq")
	private Integer id;
	
	@Column(name = "nm_brinquedo", nullable = false, length = 80)
	private String nome;
	
	@Column(name = "tipo_brinquedo", nullable = false, length = 50)
	private String tipo;
	
	@Column(name = "classificacao_brinquedo", nullable = false, length = 30)
	private String classificacao;
	
	@Column(name = "tamanho_brinquedo", nullable = false, length = 20)
	private String tamanho;
	
	@Column(name = "preco_brinquedo", nullable = false)
	private Double preco;
	
	
	public Brinquedo() {
		super();
	}


	public Brinquedo(String nome, String tipo, String classificacao, String tamanho, Double preco) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.classificacao = classificacao;
		this.tamanho = tamanho;
		this.preco = preco;
	}


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
