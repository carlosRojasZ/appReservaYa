package com.miapp.proyectoSpring.pojo;

 
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.MetaValue;

@Table(name="propietario")
public class Propietario implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	public String nombrePropietario;
	
	@OneToMany
	public List<Local> listaLocales;
	
	public String getNombrePropietario() {
		return nombrePropietario;
	}
	public void setNombrePropietario(String nombrePropietario) {
		this.nombrePropietario = nombrePropietario;
	}
	public List<Local> getListaLocales() {
		return listaLocales;
	}
	public void setListaLocales(List<Local> listaLocales) {
		this.listaLocales = listaLocales;
	}
 
	
	
	
}
