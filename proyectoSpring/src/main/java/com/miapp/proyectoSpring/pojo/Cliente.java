package com.miapp.proyectoSpring.pojo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.MetaValue;

@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;

	public String nombre;

	public Number password;
	public Number telefono;

	@Column(name = "list_reservas")
	@OneToMany(targetEntity = Reserva.class)
	public List<Reserva> listaReserva;


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

	public List<Reserva> getListaReserva() {
		return this.listaReserva;
	}

	public void setListaReserva(List<Reserva> listReservas) {
		this.listaReserva = listReservas;
	}

}
