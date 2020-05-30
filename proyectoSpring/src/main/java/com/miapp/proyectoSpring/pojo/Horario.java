package com.miapp.proyectoSpring.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Table(name = "horario")
public class Horario implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;

	public int tipo; // 1 = jornada completa, 2 = jornada tarde, 3 = joranada mañana

	@Column(name = "apertura_maniana")
	@Temporal(TemporalType.DATE)
	public Date aperturaM;
	@Column(name = "apertura_tarde")
	public Date aperturaT;
	@Column(name = "cierre_maniana")
	public Date cierreM;
	@Column(name = "cierre_tarde")
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

}
