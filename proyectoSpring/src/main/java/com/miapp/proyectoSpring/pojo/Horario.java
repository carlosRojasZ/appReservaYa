package com.miapp.proyectoSpring.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "horario")
public class Horario implements Serializable {

	private static final long serialVersionUID = -4086792299588540528L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;

	@Column
	public int tipo; // 1 = jornada completa, 2 = jornada tarde, 3 = joranada mañana

	@Column(name = "apertura_maniana")
	@Temporal(TemporalType.TIME)
	public Date aperturaM;

	@Column(name = "apertura_tarde")
	@Temporal(TemporalType.TIME)
	public Date aperturaT;

	@Column(name = "cierre_maniana")
	@Temporal(TemporalType.TIME)
	public Date cierreM;

	@Column(name = "cierre_tarde")
	@Temporal(TemporalType.TIME)
	public Date cierreT;

	
	
	
	public int getTipo() {
		establecerTipoHorario();
		return tipo;
	}

	public void establecerTipoHorario() {
		if (this.aperturaM != null && this.cierreT != null) {
			this.tipo = 1;
		}
		if (this.aperturaT != null && this.aperturaM == null && this.cierreM == null && this.cierreT != null) {
			this.tipo = 2;
		}
		if (this.aperturaM != null && this.aperturaT == null && this.cierreM != null && this.cierreT == null) {
			this.tipo = 3;
		}
	}

	public void setTipo(int tipo) {

		this.tipo = tipo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getAperturaM() {
		return aperturaM;
	}

	public void setAperturaM(Date aperturaM) {
		this.aperturaM = aperturaM;
	}

	public Date getAperturaT() {
		return aperturaT;
	}

	public void setAperturaT(Date aperturaT) {
		this.aperturaT = aperturaT;
	}

	public Date getCierreM() {
		return cierreM;
	}

	public void setCierreM(Date cierreM) {
		this.cierreM = cierreM;
	}

	public Date getCierreT() {
		return cierreT;
	}

	public void setCierreT(Date cierreT) {
		this.cierreT = cierreT;
	}

}
