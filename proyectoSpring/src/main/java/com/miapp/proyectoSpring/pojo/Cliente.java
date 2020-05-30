package com.miapp.proyectoSpring.pojo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
import javax.persistence.OneToMany;
import javax.persistence.Table;
 

@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {
 
	private static final long serialVersionUID = 5391053006819927007L;

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	
//	@OneToMany(targetEntity = Reserva.class)
	@Column(name = "id_reservas")
	public Long idReserva;

	@Column
	public String nombre;
	
	@Column
	public String password;
	
	@Column
	public Number telefono;

	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Number getTelefono() {
		return telefono;
	}

	public void setTelefono(Number telefono) {
		this.telefono = telefono;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(Long idReserva) {
		this.idReserva = idReserva;
	}
 

}
