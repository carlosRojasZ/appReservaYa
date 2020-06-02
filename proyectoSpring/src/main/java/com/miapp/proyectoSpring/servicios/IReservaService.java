package com.miapp.proyectoSpring.servicios;

import java.util.List;

import com.miapp.proyectoSpring.pojo.Reserva;
 
public interface IReservaService {
	public List<Reserva> findAll();
	public Reserva findById(Long id);
	
	public Reserva save(Reserva reserva);
	
	public void deleteById(Long id);
}
