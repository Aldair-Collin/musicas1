
package com.java.MVCSpringTienda.dao;

import com.java.MVCSpringTienda.dominio.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteDao extends CrudRepository<Cliente, String>{
    
}
