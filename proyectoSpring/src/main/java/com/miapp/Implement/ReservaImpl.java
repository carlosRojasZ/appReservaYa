package com.miapp.Implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.miapp.proyectoSpring.dao.ReservaDAO;
import com.miapp.proyectoSpring.interfaces.IReserva;
import com.miapp.proyectoSpring.pojo.Reserva;

public class ReservaImpl implements IReserva{

	@Autowired
	private ReservaDAO reservaDAO;
	
	@Override
	@Transactional(readOnly = true)
	public List<Reserva> findAll() {
		return (List<Reserva>) reservaDAO.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Reserva findById(Long id) {
		return reservaDAO.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Reserva save(Reserva producto) {
		return reservaDAO.save(producto);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		reservaDAO.deleteById(id);
	}

}
