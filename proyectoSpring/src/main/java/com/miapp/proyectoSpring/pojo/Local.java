package com.miapp.proyectoSpring.pojo;

 
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name="local")
public class Local implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	
	@Column(name = "nombre_local")
	public String nombreLocal;
	
	@Column(name = "telefono_local")
	public Number telefonoLocal;
	
	public String direccion;
	
	@OneToOne(targetEntity = Horario.class)
	public Horario horario;
	
	@Column(name = "num_reservas_disponibles")
	public int numReservasDisponibles;// total de reservas que tiene un local, añadidas por el cliente.
	
	@OneToMany(targetEntity = Reserva.class)
	public List<Reserva> listaReservas;
	
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

		if (numReservasDisponibles > getNumReservasSolicitadas()) {
			return true;
		}
		return false;
	}

	public int getNumReservasSolicitadas() {
		return listaReservas.size();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Horario getHorario() {
		return horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}

	public int getNumReservasDisponibles() {
		return numReservasDisponibles;
	}

	public void setNumReservasDisponibles(int numReservasDisponibles) {
		this.numReservasDisponibles = numReservasDisponibles;
	}

	public List<Reserva> getListaReservas() {
		return listaReservas;
	}

	public void setListaReservas(List<Reserva> listaReservas) {
		this.listaReservas = listaReservas;
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

	
	 
}
