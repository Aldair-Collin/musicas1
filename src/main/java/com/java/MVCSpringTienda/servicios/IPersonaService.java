package com.java.MVCSpringTienda.servicios;

import java.util.List;
import com.java.MVCSpringTienda.dominio.Persona;

public interface IPersonaService {
	
	public List<Persona> listarPersona();
	   
	   public void guardarPersona(Persona persona);
	   
	   public void eliminarPersona(Persona persona);
	   
	   public Persona encontrarPersona(Persona persona);
}
