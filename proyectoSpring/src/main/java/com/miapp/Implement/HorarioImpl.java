package com.miapp.Implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.miapp.proyectoSpring.dao.HorarioDAO;
import com.miapp.proyectoSpring.pojo.Horario;
import com.miapp.proyectoSpring.servicios.IHorarioService;

@Service
public class HorarioImpl implements IHorarioService{

	@Autowired
	private HorarioDAO horarioDAO;
	@Override
	@Transactional(readOnly = true)
	public List<Horario> findAll() {
		return (List<Horario>) horarioDAO.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Horario findById(Long id) {
		return horarioDAO.findById(id).orElse(null);
	}

	@Override
	public Horario save(Horario horario) {
		return horarioDAO.save(horario);
	}

	@Override
	public void deleteById(Long id) {
		horarioDAO.deleteById(id);
	}

}
