package com.globant.ejemplo.controladorPersona;


import org.springframework.web.bind.annotation.*;

import com.globant.ejemplo.entidad.Persona;
import com.globant.ejemplo.servicio.PersonaServicio;

import java.util.List;

@RestController
public class PersonaControlador {

    private final PersonaServicio servicio;

    public PersonaControlador(PersonaServicio servicio) {
        this.servicio = servicio;
    }
    
    @PostMapping("/addPersona")
    public Persona addPersona(@RequestBody Persona persona) {
    return servicio.grabarPersona(persona);
    }
 
    @PostMapping("/addPersonas")
    public List<Persona> addPersonas(@RequestBody List<Persona> personas) {
        return servicio.grabarPersonas(personas);
    }

    @GetMapping("/personas")
    public List<Persona> findAllPersonas() {
        return servicio.getPersona();
    }

    @GetMapping("/personaById/{id}")
    public Persona findPersonaById(@PathVariable int id) {
        return servicio.getPersonaById(id);
    }
    
    @GetMapping("/personaByDni/{dni}")
    public Persona findPersonaByDni(@PathVariable int dni) {
        return servicio.getPersonaByDni(dni);
    }   

    @GetMapping("/personaByNombre/{nombre}")
    public Persona findPersonaByNombre(@PathVariable String nombre) {
        return servicio.getPersonaByNombre(nombre);
    }
    @GetMapping("/personaByApellido/{apellido}")
    public Persona findPersonaByApellido(@PathVariable String apellido) {
        return servicio.getPersonaByApellido(apellido);
    }
    @GetMapping("/personaByEdad/{edad}")
    public Persona findPersonaByEdad(@PathVariable int edad) {
        return servicio.getPersonaByEdad(edad);
    }
    /*@GetMapping("/personaByFechaNacimiento/{fechaNacimiento}")
    public Persona findPersonaByFechaNacimiento(@PathVariable Date fechaNacimiento) {
        return servicio.getPersonaByFechaNacimiento(fechaNacimiento);
    }*/
    
    @PutMapping("/update")
    public Persona updatePersona(@RequestBody Persona persona) {
        return servicio.updatePersona(persona);
    }

    @DeleteMapping("/delete/{id}")
    public String deletePersona(@PathVariable int id) {
        return servicio.deletePersona(id);
    }
}

