package com.miapp.Implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.miapp.proyectoSpring.dao.PropietarioDAO;
import com.miapp.proyectoSpring.interfaces.IPropietario;
import com.miapp.proyectoSpring.pojo.Propietario;

@Service
public class PropietarioImpl implements IPropietario {

	@Autowired
	private PropietarioDAO propietarioDAO;
	
	@Override
	@Transactional(readOnly = true)
	public List<Propietario> findAll() {
		return (List<Propietario>) propietarioDAO.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Propietario findById(Long id) {
		return propietarioDAO.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Propietario save(Propietario producto) {
		return propietarioDAO.save(producto);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		propietarioDAO.deleteById(id);
	}


}
