package com.miapp.proyectoSpring.dao;

import org.springframework.data.repository.CrudRepository;

import com.miapp.proyectoSpring.pojo.Cliente;


public interface ClienteDAO extends CrudRepository<Cliente, Long>{

}
