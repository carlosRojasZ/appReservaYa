package com.miapp.proyectoSpring.pojo;

import java.awt.List;
import java.util.LinkedList;

public class Propietario {

	public String nombrePropietario;
	public LinkedList<Local> local = new LinkedList<>();
	
	public String getNombrePropietario() {
		return nombrePropietario;
	}
	public void setNombrePropietario(String nombrePropietario) {
		this.nombrePropietario = nombrePropietario;
	}
	public LinkedList<Local> getLocal() {
		return local;
	}
	public void setLocal(LinkedList<Local> local) {
		this.local = local;
	}
	
	
	
}
