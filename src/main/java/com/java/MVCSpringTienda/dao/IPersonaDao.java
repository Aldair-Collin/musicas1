package com.java.MVCSpringTienda.dao;

import org.springframework.data.repository.CrudRepository;

import com.java.MVCSpringTienda.dominio.Persona;

public interface IPersonaDao extends CrudRepository<Persona, Long>{

}
