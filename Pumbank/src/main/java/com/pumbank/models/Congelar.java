package com.pumbank.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="congelar")

public class Congelar {

	private int conid;
	private Date fecha_inicio;
	private Date fecha_fin;
	private boolean activado;
	
	@ManyToMany(mappedBy = "congelada")
	private List<Padre> padre;
	
	public Congelar() {}
	
	
	public Congelar(int conid, Date fecha_inicio, Date fecha_fin, boolean activado, List<Padre> padre) {
		super();
		this.conid = conid;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.activado = activado;
		this.padre = padre;
	}


	public int getConid() {
		return conid;
	}

	public List<Padre> getPadre() {
		return padre;
	}


	public void setPadre(List<Padre> padre) {
		this.padre = padre;
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