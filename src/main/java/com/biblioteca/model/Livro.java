package com.biblioteca.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "livro")
public class Livro implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LIVRO_SEQUENCE")
	@SequenceGenerator(name="LIVRO_SEQUENCE", sequenceName="LIVRO_SEQUENCE", allocationSize = 1)
	private Long id;
	
	private String nome;
	
	private String autor;
	
	private LocalDate ano;
	
	protected Livro() {
	}
	
	public Livro(Long id, String nome, String autor, LocalDate ano) {
		this.id = id;
		this.nome = nome;
		this.autor = autor;
		this.ano = ano;
	}
	
}
