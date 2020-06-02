package com.miapp.proyectoSpring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController; 
import com.miapp.proyectoSpring.pojo.Cliente;
import com.miapp.proyectoSpring.servicios.IClienteService;
 
@RestController
public class ClienteController {

	@Autowired
	private IClienteService clienteServer;
	
	@GetMapping("/listar")
	public List<Cliente> listar(){
		return clienteServer.findAll();
	}
	
	@GetMapping("/cliente/{id}")
	public Cliente detalleCliente(@PathVariable Long id) {
		return clienteServer.findById(id);
	}
	
}
