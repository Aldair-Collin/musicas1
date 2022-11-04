
package com.java.MVCSpringTienda.servicios;

import com.java.MVCSpringTienda.dominio.Cliente;
import java.util.List;


public interface IClienteService {
    
   public List<Cliente> listarCliente();
   
   public void guardarCliente(Cliente cliente);
   
   public void eliminarCliente(Cliente cliente);
   
   public Cliente encontrarCliente(Cliente cliente);
   
   Cliente GuardarClientes(Cliente cliente);
}
