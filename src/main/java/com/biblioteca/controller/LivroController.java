package com.biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.dto.LivroDTO;
import com.biblioteca.service.LivroService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("livros")
public class LivroController {
	
	@Autowired
	private LivroService livroService;
	
	@GetMapping
	@ApiOperation(value = "Retorna lista de livros cadastrados")
	public ResponseEntity<List<LivroDTO>> getLivros() {
		return new ResponseEntity<>(this.livroService.getAll(), HttpStatus.OK);
	}
	
	@PostMapping
	@ApiOperation(value = "Cria um novo livro")
	public ResponseEntity<LivroDTO> createLivros(@RequestBody final LivroDTO livroDTO) {
		return new ResponseEntity<>(this.livroService.salvar(livroDTO), HttpStatus.CREATED);
	}
	
	@PutMapping("/{id}")
	@ApiOperation(value = "Atualiza um livro")
	public ResponseEntity<LivroDTO> updateLivro(LivroDTO livro, @PathVariable Long id) {
		if(this.livroService.exists(id)) {
			return new ResponseEntity<>(this.livroService.salvar(livro), HttpStatus.CREATED);
		}
		
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}	
	
	@DeleteMapping("/{id}")
	@ApiOperation(value = "Apaga um livro")
	public ResponseEntity<LivroDTO> deletarLivro(@PathVariable Long id) {
		if(this.livroService.exists(id)) {
			this.livroService.apagar(id);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}	
}
