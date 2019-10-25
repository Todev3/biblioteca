package com.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblioteca.dto.LivroDTO;
import com.biblioteca.mapper.LivroMapper;
import com.biblioteca.repository.LivroRepository;

@Service
public class LivroService {

	@Autowired
	private LivroRepository livroRepository;
	
	@Autowired
	private LivroMapper livroMapper;
	
	public LivroDTO salvar(LivroDTO livro) {
		return this.livroMapper.toDTO(this.livroRepository.save(livroMapper.toModel(livro)));
	}
	
	public List<LivroDTO> getAll() {
		return this.livroMapper.toDTO(this.livroRepository.findAll());
	}
	
	public Boolean exists(Long id) {
		return this.livroRepository.existsById(id);
	}
	
	public void apagar(Long id) {
		this.livroRepository.deleteById(id);
	}
	
}
