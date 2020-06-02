package com.miapp.proyectoSpring.servicios;

import java.util.List;

 
import com.miapp.proyectoSpring.pojo.Local;

public interface ILocalService {
	public List<Local> findAll();
	public Local findById(Long id);
	
	public Local save(Local local);
	
	public void deleteById(Long id);
}
