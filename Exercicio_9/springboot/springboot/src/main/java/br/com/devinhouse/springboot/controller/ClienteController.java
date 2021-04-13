package br.com.devinhouse.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.devinhouse.springboot.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteService service;
	
	@GetMapping(path = "/imprime-nome/{idade}/{nome}")
	@ResponseBody
	public String imprimirNome(@PathVariable Integer idade, @PathVariable String nome) {
		
		
		
		return service.formatarNomeIdade(nome, idade);
	}

}
