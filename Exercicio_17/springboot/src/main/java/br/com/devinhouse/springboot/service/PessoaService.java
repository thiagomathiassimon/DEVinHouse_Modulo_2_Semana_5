package br.com.devinhouse.springboot.service;

import java.time.LocalDateTime;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

	public String formatarNome(String nome) {
		return "Nome: " + nome;
	}

	@Scheduled(cron = "${cron.teste}")
	public void imprimirDataEHora() {

		System.out.println(LocalDateTime.now());
		System.out.println("Data: " + LocalDateTime.now().getDayOfMonth() + "/" + LocalDateTime.now().getMonthValue() + "/"
				+ LocalDateTime.now().getYear());
		System.out.println("Hora: " + LocalDateTime.now().getHour() + ":" + LocalDateTime.now().getMinute() + ":"
				+ LocalDateTime.now().getSecond());
	}

}
