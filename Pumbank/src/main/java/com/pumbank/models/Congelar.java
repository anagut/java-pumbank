package com.pumbank.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="congelar")
//@Table(name="congelarcuenta")

public class Congelar {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int conid;
	
	@Column(name="fecha_inicio")
	private Date fecha_inicio;
	
	@Column(name="fecha_fin")
	private Date fecha_fin;
	
	@Column(name="activado")
	private boolean activado;
	
	@Column(name="padre")
	private int pid;
	
	@Column(name="hijo")
	private int hid;

	public Congelar() {}
	
	
	public Congelar(int conid, Date fecha_inicio, Date fecha_fin, boolean activado, List<Padre> padre) {
		super();
		this.conid = conid;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.activado = activado;
	}


	public int getConid() {
		return conid;
	}


	public void setConid(int conid) {
		this.conid = conid;
	}

	public Date getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public Date getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

	public boolean isActivado() {
		return activado;
	}

	public void setActivado(boolean activado) {
		this.activado = activado;
	}


	
}
