package com.miapp.proyectoSpring.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Table(name="reserva")
public class Reserva {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;
	
	@OneToOne
	public Local idLocal;
		
	@OneToOne
	public String idCliente;
	
	@Column(name = "telefono_reserva")
	public Number telefonoReserva;

	@Column(name = "fecha_hora")
	@Temporal(TemporalType.DATE)
	public Date fechaHora;
	
	@Column(name = "numero_personas")
	public int numeroPersonas;
	
	public String mensaje;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Local getIdLocal() {
		return idLocal;
	}

	public void setIdLocal(Local idLocal) {
		this.idLocal = idLocal;
	}

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public Number getTelefonoReserva() {
		return telefonoReserva;
	}

	public void setTelefonoReserva(Number telefonoReserva) {
		this.telefonoReserva = telefonoReserva;
	}

	public Date getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}

	public int getNumeroPersonas() {
		return numeroPersonas;
	}

	public void setNumeroPersonas(int numeroPersonas) {
		this.numeroPersonas = numeroPersonas;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
  
	
	 
}
