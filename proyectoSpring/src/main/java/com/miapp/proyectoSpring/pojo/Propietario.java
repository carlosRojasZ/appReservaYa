package com.miapp.proyectoSpring.pojo;

 
import java.io.Serializable;
import java.util.LinkedList;
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
@Table(name="propietario")
public class Propietario implements Serializable {

	private static final long serialVersionUID = 2637120032292885635L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	
//	@OneToMany(targetEntity = Local.class)
	@Column(name = "id_local")
	public Long idLocal;
	
	@Column(name = "nombre_propietario")
	public String nombrePropietario;
	
	
	
	public String getNombrePropietario() {
		return nombrePropietario;
	}
	public void setNombrePropietario(String nombrePropietario) {
		this.nombrePropietario = nombrePropietario;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getIdLocal() {
		return idLocal;
	}
	public void setIdLocal(Long idLocal) {
		this.idLocal = idLocal;
	}
 
	
}
