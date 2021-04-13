package br.com.devinhouse.springboot.service;

import org.springframework.stereotype.Service;

@Service
public class ClienteService {

	public String formatarNomeIdade(String nome, Integer idade) {
		return "<H1>nome é ::" + nome + "<br/>idade é ::" + idade + "<H1>";
	}

}
