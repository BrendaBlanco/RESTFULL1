package com.globant.ejemplo.entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="persona")
public class Persona {
	
	@Id
    @GeneratedValue
    private long id;
	private int dni;
	private String nombre;
	private String apellido;
	private int edad;

}
