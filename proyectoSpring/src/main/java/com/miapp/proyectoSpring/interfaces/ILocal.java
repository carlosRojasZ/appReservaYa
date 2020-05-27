package com.miapp.proyectoSpring.interfaces;

import java.util.List;

 
import com.miapp.proyectoSpring.pojo.Local;

public interface ILocal {
	public List<Local> findAll();
	public Local findById(Long id);
	
	public Local save(Local local);
	
	public void deleteById(Long id);
}
