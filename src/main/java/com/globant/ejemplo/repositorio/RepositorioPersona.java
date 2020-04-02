package com.globant.ejemplo.repositorio;


import org.springframework.data.jpa.repository.JpaRepository;

import com.globant.ejemplo.entidad.Persona;

public interface RepositorioPersona extends JpaRepository<Persona, Long>{
   
	Persona findByDni(int dni);
	Persona findByNombre(String nombre);
	Persona findByApellido(String apellido);
	Persona findByEdad(int edad);
	
}
