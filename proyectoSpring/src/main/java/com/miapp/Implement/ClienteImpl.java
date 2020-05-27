package com.miapp.Implement;

import java.util.List;
 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.miapp.proyectoSpring.dao.ClienteDAO;
import com.miapp.proyectoSpring.interfaces.ICliente;
import com.miapp.proyectoSpring.pojo.Cliente;

public class ClienteImpl implements ICliente {

	@Autowired
	private ClienteDAO clienteDAO;
	
	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {
	
		return (List<Cliente>) clienteDAO.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Cliente findById(Long id) {

		return clienteDAO.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Cliente save(Cliente cliente) {
		return clienteDAO.save(cliente);
	}

	@Override
	public void deleteById(Long id) {
		clienteDAO.deleteById(id);
	}

}
