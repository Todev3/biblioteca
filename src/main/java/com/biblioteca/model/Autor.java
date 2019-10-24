package com.biblioteca.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Setter;

import lombok.Getter;

@Getter
@Setter
@Entity
public class Autor {
	
	@Id
	private int id;
	
	private String nome;
	
	private LocalDate nascimento;
	
	public Autor() {
	}
	
}
