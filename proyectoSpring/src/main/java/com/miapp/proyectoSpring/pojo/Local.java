package com.miapp.proyectoSpring.pojo;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;

@Entity
@Table(name = "local")
public class Local implements Serializable {

	private static final long serialVersionUID = -4020841562566458540L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;

//	@OneToOne(targetEntity = Horario.class)
	@Column(name = "id_horario")
	public Long idHorario;

//	@OneToMany(targetEntity = Reserva.class)
	@Column(name = "id_reserva")
	public Long idReserva;

	@Column(name = "nombre_local")
	public String nombreLocal;

	@Column(name = "telefono_local")
	public Number telefonoLocal;

	@Column
	public String direccion;

	@Column(name = "num_reservas_disponibles")
	public int numReservasDisponibles;// total de reservas que tiene un local, añadidas por el cliente.

	@Column(name = "tipo_negocio")
	public String tipoNegocio;// negocio1 BAR - negocio2 OTROS

	@Column(name = "limite_personas_por_reserva")
	public int limPersonasPorReserva;

	
	
	public int getLimPersonasPorReserva() {
		if (this.tipoNegocio.equals("BAR")) {
			limPersonasPorReserva = 10;
		} else {
			limPersonasPorReserva = 1;
		}
		return limPersonasPorReserva;
	}

	public boolean esPosibleReservar() {

		if (numReservasDisponibles > 0) {
			return true;
		}
		return false;
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

	public String getNombreLocal() {
		return nombreLocal;
	}

	public void setNombreLocal(String nombreLocal) {
		this.nombreLocal = nombreLocal;
	}

	public Number getTelefonoLocal() {
		return telefonoLocal;
	}

	public void setTelefonoLocal(Number telefonoLocal) {
		this.telefonoLocal = telefonoLocal;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getNumReservasDisponibles() {
		return numReservasDisponibles;
	}

	public void setNumReservasDisponibles(int numReservasDisponibles) {
		this.numReservasDisponibles = numReservasDisponibles;
	}
 
	public String getTipoNegocio() {
		return tipoNegocio;
	}

	public void setTipoNegocio(String tipoNegocio) {
		this.tipoNegocio = tipoNegocio;
	}

	public void setLimPersonasPorReserva(int limPersonasPorReserva) {
		this.limPersonasPorReserva = limPersonasPorReserva;
	}

	public Long getIdHorario() {
		return idHorario;
	}

	public void setIdHorario(Long idHorario) {
		this.idHorario = idHorario;
	}

}
