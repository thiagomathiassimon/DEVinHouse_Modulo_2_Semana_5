package br.com.devinhouse.springboot.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Parametros {

	@Value("${pessoa.nome}")
	private String nome;

	@Value("${pessoa.idade}")
	private int idade;

	@Value("${pessoa.profissao}")
	private String profissao;

	public String getNome() {
		System.out.println(this.nome);
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		System.out.println(this.idade);
		return this.idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getProfissao() {
		System.out.println(this.profissao);
		return this.profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

}
