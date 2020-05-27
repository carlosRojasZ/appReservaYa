package com.miapp.proyectoSpring.interfaces;

import java.util.List;

import com.miapp.proyectoSpring.pojo.Propietario;
 
public interface IPropietario {
	public List<Propietario> findAll();
	public Propietario findById(Long id);
	
	public Propietario save(Propietario propietario);
	
	public void deleteById(Long id);
}
