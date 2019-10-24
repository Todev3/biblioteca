package com.biblioteca.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.biblioteca.dto.LivroDTO;
import com.biblioteca.model.Livro;

@Service
public class LivroMapper {
	
	public Livro toModel(LivroDTO dto) {
		return new Livro(dto.getNome(), dto.getAutor(), dto.getAno());
	}
	
	public LivroDTO toDTO(Livro model) {
		return new LivroDTO(model.getId(), model.getNome(), model.getAutor(), model.getAno());
	}
	
	public List<Livro> toModel(List<LivroDTO> dtos) {
		List<Livro> livros = new ArrayList<>();
		dtos.forEach(dto -> livros.add(this.toModel(dto)));
		return livros;
	}
	
	public List<LivroDTO> toDTO(List<Livro> models) {
		List<LivroDTO> livros = new ArrayList<>();
		models.forEach(model -> livros.add(this.toDTO(model)));
		return livros;
	}
	
}
