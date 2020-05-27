package com.miapp.proyectoSpring.interfaces;

import java.util.List;
 
import com.miapp.proyectoSpring.pojo.Cliente;

public interface ICliente {
	public List<Cliente> findAll();
	public Cliente findById(Long id);
	
	public Cliente save(Cliente cliente);
	
	public void deleteById(Long id);
}
