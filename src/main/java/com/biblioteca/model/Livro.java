package com.biblioteca.model;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@Entity
public class Livro {
	
//	@Id
	private Integer id;
	
	private String nome;
	
	private String autor;
	
	private LocalDate ano;
	
	public Livro(Integer id, String nome, String autor, LocalDate ano) {
		this.id = id;
		this.nome = nome;
		this.autor = autor;
		this.ano = ano;
	}
	
}
