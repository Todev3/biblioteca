package com.biblioteca.dto;

import java.time.LocalDate;

import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel(value="Livro", description = "Uma model simples de um livro")
public class LivroDTO {
	
	private Integer id;
	
	private String nome;
	
	private String autor;
	
	private LocalDate ano;
	
	public LivroDTO(Integer id, String nome, String autor, LocalDate ano) {
		this.id = id;
		this.nome = nome;
		this.autor = autor;
		this.ano = ano;
	}
	
}
