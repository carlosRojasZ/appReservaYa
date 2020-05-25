package com.miapp.proyectoSpring.pojo;

import java.util.Date;

public class Reserva {
	
	public long idReserva;
	public Local idLocal;
	public String nombreReserva;
	public Number telefonoReserva;
	public Date fechaHora;
	public int numeroPersonas;
	public String mensaje;
	
	public Reserva(long idReserva, Local idLocal, String nombreReserva, Number telefonoReserva, Date fechaHora,
			int numeroPersonas, String mensaje) {
		super();
		this.idReserva = idReserva;
		this.idLocal = idLocal;
		this.nombreReserva = nombreReserva;
		this.telefonoReserva = telefonoReserva;
		this.fechaHora = fechaHora;
		this.numeroPersonas = numeroPersonas;
		this.mensaje = mensaje;
	}

	// Getter y Setters
	
	
	public Local getIdLocal() {
		return idLocal;
	}

	public long getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(long idReserva) {
		this.idReserva = idReserva;
	}

	public void setIdLocal(Local idLocal) {
		this.idLocal = idLocal;
	}

	public String getNombreReserva() {
		return nombreReserva;
	}

	public void setNombreReserva(String nombreReserva) {
		this.nombreReserva = nombreReserva;
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
