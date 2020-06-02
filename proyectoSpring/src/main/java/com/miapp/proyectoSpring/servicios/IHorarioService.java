package com.miapp.proyectoSpring.servicios;

import java.util.List;

import com.miapp.proyectoSpring.pojo.Horario;

public interface IHorarioService {
	public List<Horario> findAll();
	public Horario findById(Long id);
	
	public Horario save(Horario horario);
	
	public void deleteById(Long id);
}
