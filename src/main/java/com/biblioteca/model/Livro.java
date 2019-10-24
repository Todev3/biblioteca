package com.biblioteca.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Livro {
	
	@Id
	private int id;
	
	private String nome;
	
	private String autor;
	
	private String ano;
	
	public Livro() {
	}
	
}
