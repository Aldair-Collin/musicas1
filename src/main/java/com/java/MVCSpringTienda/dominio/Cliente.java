
package com.java.MVCSpringTienda.dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Data
@Entity
@Table(name = "clientes")
public class Cliente implements Serializable{
    private static final long serialVersionUID=1L;
    
    @Id
    @NotEmpty
    private String id;
    @NotEmpty
    private String nombre;
    @NotEmpty
    private String apellido;
    @NotEmpty
    private String celular;
    private String direccion;
    @Column(name="correo_electronico")
    @NotEmpty
    private String correoElectronico;
}
