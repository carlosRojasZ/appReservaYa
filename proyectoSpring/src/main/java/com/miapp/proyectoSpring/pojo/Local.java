package com.miapp.proyectoSpring.pojo;

import java.awt.font.NumericShaper;
import java.util.LinkedList;

public class Local {

	public Propietario propietario;
	public String nombreLocal;
	public Number telefonoLocal;
	public String direccion;
	public Horario horario;
	public int numReservasDisponibles;// total de reservas que tiene un local, añadidas por el cliente.
	public LinkedList<Reserva> listaReservas = new LinkedList<>();
	public String tipoNegocio;// negocio1 BAR - negocio2 OTROS
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

	public boolean addReserva(Reserva reserva) {
		if (esPosibleReservar()) {
			listaReservas.add(reserva);
			return true;
		}
		return false;
	}

	public int getNumReservasDisponibles() {

		return numReservasDisponibles;
	}

	public void setNumReservasDisponibles(int numReservasDisponibles) {
		this.numReservasDisponibles = numReservasDisponibles;
	}

	public int getNumReservasSolicitadas() {

		return listaReservas.size();
	}

	public LinkedList<Reserva> getListaReservas() {
		return listaReservas;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
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

}
