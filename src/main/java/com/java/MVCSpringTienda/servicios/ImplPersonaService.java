package com.java.MVCSpringTienda.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java.MVCSpringTienda.dao.IPersonaDao;
import com.java.MVCSpringTienda.dominio.Persona;

@Service
public class ImplPersonaService implements IPersonaService {

	@Autowired
	private IPersonaDao personaDao;

	@Override
	@Transactional(readOnly = true)
	public List<Persona> listarPersona() {
		return (List<Persona>) personaDao.findAll();
	}

	@Override
    @Transactional
	public void guardarPersona(Persona persona) {
		personaDao.save(persona);

	}

	@Override
	@Transactional
	public void eliminarPersona(Persona persona) {
		personaDao.delete(persona);
	}

	@Override
	@Transactional(readOnly = true)
	public Persona encontrarPersona(Persona persona) {
		return personaDao.findById(persona.getId()).orElse(null);
	}

}
