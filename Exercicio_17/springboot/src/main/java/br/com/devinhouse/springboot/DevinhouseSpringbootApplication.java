package br.com.devinhouse.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableScheduling
@ComponentScan(basePackages = "br.com.devinhouse.*")
public class DevinhouseSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevinhouseSpringbootApplication.class, args);
	}

}
