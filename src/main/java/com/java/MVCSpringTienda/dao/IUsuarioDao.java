
package com.java.MVCSpringTienda.dao;

import com.java.MVCSpringTienda.dominio.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IUsuarioDao extends JpaRepository<Usuario, Long>{
    Usuario findByUsername(String username);
    
}
