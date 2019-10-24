package com.biblioteca.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("livro")
public class LivroController {
	
	@GetMapping
	public String get() {
		return "Ola mundo";
	}
	
}
