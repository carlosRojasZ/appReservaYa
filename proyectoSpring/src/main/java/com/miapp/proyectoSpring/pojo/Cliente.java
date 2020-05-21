package com.miapp.proyectoSpring.pojo;

import java.util.List;


public class Cliente {
	
	public String nombre;
	public Number password;
	public Number telefono;
	public List <Reservas >listReservas;
	
	
	//Getter and Setter .... ...
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Number getPassword() {
		return password;
	}
	public void setPassword(Number password) {
		this.password = password;
	}
	public Number getTelefono() {
		return telefono;
	}
	public void setTelefono(Number telefono) {
		this.telefono = telefono;
	}
	public List<Reservas> getListReservas() {
		return listReservas;
	}
	public void setListReservas(List<Reservas> listReservas) {
		this.listReservas = listReservas;
	}
	
	

}
