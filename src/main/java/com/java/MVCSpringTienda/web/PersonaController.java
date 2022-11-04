package com.java.MVCSpringTienda.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.MVCSpringTienda.dominio.Persona;
import com.java.MVCSpringTienda.servicios.IPersonaService;

@RestController
@RequestMapping("/personas")
public class PersonaController {
	
	  @Autowired
	    private IPersonaService personaService;
	    
	    @GetMapping
	    public List<Persona> listarPersonas(){
	        return personaService.listarPersona();
	    }
	    
	    @PostMapping
	    public void insertarPersonas(@RequestBody Persona persona){
	    	personaService.guardarPersona(persona);
	    }

}
