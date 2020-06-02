package com.miapp.proyectoSpring.servicios;

import java.util.List;

import com.miapp.proyectoSpring.pojo.Propietario;
 
public interface IPropietarioService {
	public List<Propietario> findAll();
	public Propietario findById(Long id);
	
	public Propietario save(Propietario propietario);
	
	public void deleteById(Long id);
}
