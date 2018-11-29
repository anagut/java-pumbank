package com.pumbank.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="paga")


public class Paga {

	private int pdig;
	private int saldo;
	private int frecuencia_dias;
	
	@ManyToMany(mappedBy = "pagas")
	private List<Padre> padre;
	
	public Paga() {}

	public Paga(int pdig, int saldo, int frecuencia_dias, List<Padre> padre) {
		super();
		this.pdig = pdig;
		this.saldo = saldo;
		this.frecuencia_dias = frecuencia_dias;
		this.padre = padre;
	}

	public int getPdig() {
		return pdig;
	}

	public List<Padre> getPadre() {
		return padre;
	}

	public void setPadre(List<Padre> padre) {
		this.padre = padre;
	}

	public void setPdig(int pdig) {
		this.pdig = pdig;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public int getFrecuencia_dias() {
		return frecuencia_dias;
	}

	public void setFrecuencia_dias(int frecuencia_dias) {
		this.frecuencia_dias = frecuencia_dias;
	}
	

}
