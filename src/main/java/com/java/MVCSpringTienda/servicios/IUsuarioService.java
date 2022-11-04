
package com.java.MVCSpringTienda.servicios;

import com.java.MVCSpringTienda.dao.IUsuarioDao;
import com.java.MVCSpringTienda.dominio.Rol;
import com.java.MVCSpringTienda.dominio.Usuario;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userDetailsService")

public class IUsuarioService  implements UserDetailsService{
    
    @Autowired 
    private IUsuarioDao usuariodao;
    
    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario=usuariodao.findByUsername(username);
        if(usuario==null){
            throw new UsernameNotFoundException(username);
        }
        List<GrantedAuthority> roles= new ArrayList<>();
        for(Rol rol:usuario.getRoles()){
            roles.add(new SimpleGrantedAuthority(rol.getNombre()));
        }
        return new User(usuario.getUsername(), usuario.getPassword(),roles);
    }
    
}
