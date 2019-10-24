package com.biblioteca.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.dto.LivroDTO;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("livros")
public class LivroController {
	
	@GetMapping
	@ApiOperation(value = "Retorna lista de livros cadastrados")
	public ResponseEntity<List<LivroDTO>> getLivros() {
		List<LivroDTO> livros = new ArrayList<>();
		
		livros.add(new LivroDTO(null, "", "", LocalDate.now()));
		
		return new ResponseEntity<>(livros, HttpStatus.OK);
	}
	
}
