package com.biblioteca.dto;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel(value="Livro", description = "Uma model simples de um livro")
public class LivroDTO {
	
	@ApiModelProperty(example = "1")
	private Long id;
	
	@ApiModelProperty(example = "A Evolução das Especies")
	private String nome;
	
	@ApiModelProperty(example = "Charles Darwin")
	private String autor;
	
	@ApiModelProperty(example = "2014-01-01")
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate ano;
	
	public LivroDTO(Long id, String nome, String autor, LocalDate ano) {
		this.id = id;
		this.nome = nome;
		this.autor = autor;
		this.ano = ano;
	}
	
}
