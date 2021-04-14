package br.com.devinhouse.springboot.service;

import org.springframework.stereotype.Service;

@Service
public class PessoaService {

	public String formatarNome(String nome) {
		return "Nome: " + nome;
	}
	
}
