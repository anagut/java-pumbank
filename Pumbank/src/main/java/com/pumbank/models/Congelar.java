package com.pumbank.models;

import java.util.Date;

public class Congelar {

	private int conid;
	private Date fecha_inicio;
	private Date fecha_fin;
	private boolean activado;
	
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

	public Congelar(int conid, Date fecha_inicio, Date fecha_fin, boolean activado) {
		super();
		this.conid = conid;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.activado = activado;
	}

	public Congelar() {}
}
