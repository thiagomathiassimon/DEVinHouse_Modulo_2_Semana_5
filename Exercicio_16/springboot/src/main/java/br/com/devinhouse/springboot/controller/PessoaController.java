package br.com.devinhouse.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.devinhouse.springboot.service.Parametros;
import br.com.devinhouse.springboot.service.PessoaService;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

	@Autowired
	PessoaService service;
	
	@Autowired
	Parametros parametros;
	
	@GetMapping(path = "/{nome}")
	@ResponseBody
	public String imprimirNome(@PathVariable String nome) {
		return service.formatarNome(nome);
	}
	
	@GetMapping(path = "/parametros")
	@ResponseBody
	public String imprimirParametros() {
		service.imprimirDataEHora();
		return parametros.getNome() + "<br/>" + parametros.getIdade() + "<br/>" + parametros.getProfissao();
	}

	
}
