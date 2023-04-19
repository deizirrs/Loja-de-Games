package com.generation.lojagames.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produto")
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message = "O Atributo nome é Obrigatório!")
	private String nome;
	
	@NotBlank(message = "O Atributo descrição é Obrigatório!")
	@Size(max = 100, message = "O atributo descrição deve ter no máximo 100 caracteres")
	private String descricao;
	
	@UpdateTimestamp
	private LocalDate dateLancamento;
	
	@NotNull
	@PositiveOrZero
	private BigDecimal preco;
	
	@NotBlank(message = "O Atributo console é Obrigatório!")
	@Size(max = 20, message = "O atributo console deve ter máximo 20 caracteres")
	private String console;
	
	@Size(max = 100, message = "O atributo descrição deve ter no máximo 100 caracteres")
	private String foto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getDateLancamento() {
		return dateLancamento;
	}

	public void setDateLancamento(LocalDate dateLancamento) {
		this.dateLancamento = dateLancamento;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	

}
