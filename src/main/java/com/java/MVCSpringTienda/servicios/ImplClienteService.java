
package com.java.MVCSpringTienda.servicios;

import com.java.MVCSpringTienda.dao.IClienteDao;
import com.java.MVCSpringTienda.dominio.Cliente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ImplClienteService implements IClienteService{
    
    @Autowired
    private IClienteDao iclientedao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Cliente> listarCliente() {
        return (List<Cliente>) iclientedao.findAll();
    }

    @Override
    @Transactional
    public void guardarCliente(Cliente cliente) {
        iclientedao.save(cliente);
    }

    @Override
    @Transactional
    public void eliminarCliente(Cliente cliente) {
        iclientedao.delete(cliente);
    }

    @Override
    @Transactional(readOnly = true)
    public Cliente encontrarCliente(Cliente cliente) {
       return iclientedao.findById(cliente.getId()).orElse(null);
    }

	@Override
	@Transactional
	public Cliente GuardarClientes(Cliente cliente) {
		return iclientedao.save(cliente);
	}
    
}
