
package com.java.MVCSpringTienda.web;

import com.java.MVCSpringTienda.dominio.Cliente;
import com.java.MVCSpringTienda.servicios.IClienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteRestController {
    @Autowired
    private IClienteService iclienteservice;
    
    @GetMapping
    public List<Cliente> listarClientes(){
        return iclienteservice.listarCliente();
    }
    
    @PostMapping
    public void insertarClientes(@RequestBody Cliente cliente){
        iclienteservice.guardarCliente(cliente);
    }

	@PostMapping("/guardar")
	public Cliente GuardarCliente(@RequestBody Cliente cliente) {
		return iclienteservice.GuardarClientes(cliente);
}

    
    @PutMapping
    public void modificarCliente(@RequestBody Cliente cliente){
        iclienteservice.guardarCliente(cliente);
    }
    
    @DeleteMapping(value = "/{id}")
    public void eliminarCliente(Cliente cliente){
        iclienteservice.eliminarCliente(cliente);
    }
}
