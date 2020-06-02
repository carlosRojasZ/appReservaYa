package com.miapp.Implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.miapp.proyectoSpring.dao.LocalDAO;
import com.miapp.proyectoSpring.pojo.Local;
import com.miapp.proyectoSpring.servicios.ILocalService;

@Service
public class LocalImpl implements ILocalService{

	@Autowired
	private LocalDAO localDAO;
	
	@Override
	@Transactional(readOnly = true)
	public List<Local> findAll() {
		return (List<Local>) localDAO.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Local findById(Long id) {
		return localDAO.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Local save(Local producto) {
		return localDAO.save(producto);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		localDAO.deleteById(id);
	}

}
