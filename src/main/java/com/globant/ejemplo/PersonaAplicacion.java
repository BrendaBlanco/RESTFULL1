package com.globant.ejemplo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class PersonaAplicacion {

	public static void main(String[] args) {
		SpringApplication.run(PersonaAplicacion.class, args);
		System.out.println("\n"+"Servidor  Iniciado!!!!!");
	}

}
