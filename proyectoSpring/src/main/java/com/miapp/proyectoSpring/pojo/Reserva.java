package com.miapp.proyectoSpring.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "reserva")
public class Reserva implements Serializable {

	private static final long serialVersionUID = -6571262982675463000L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;

//	@OneToOne(targetEntity = Local.class)
	@Column(name = "id_local")
	public Long idLocal;

//	@ManyToOne(targetEntity = Cliente.class)
	@Column(name = "id_cliente")
	public Long idCliente;

	@Column(name = "telefono_reserva")
	public Number telefonoReserva;

	@Column(name = "fecha_hora")
	@Temporal(TemporalType.TIME)
	public Date fechaHora;

	@Column(name = "numero_personas")
	public int numeroPersonas;

	@Column
	public String mensaje;
	
	
	
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Long getIdLocal() {
		return idLocal;
	}

	public void setIdLocal(Long idLocal) {
		this.idLocal = idLocal;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public void setId(Long id) {
		this.id = id;
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
