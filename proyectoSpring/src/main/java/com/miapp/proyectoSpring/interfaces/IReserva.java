package com.miapp.proyectoSpring.interfaces;

import java.util.List;

import com.miapp.proyectoSpring.pojo.Reserva;
 
public interface IReserva {
	public List<Reserva> findAll();
	public Reserva findById(Long id);
	
	public Reserva save(Reserva reserva);
	
	public void deleteById(Long id);
}
