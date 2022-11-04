package com.java.MVCSpringTienda.dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

/**
 *
 * @author Admin
 */
@Entity
@Data
public class Persona implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private String nombre;

	@Column
	private String apellido;

	@Column
	private String direccion;

	@Column
	private String telefono;


	private String fechaNacimento;

}
