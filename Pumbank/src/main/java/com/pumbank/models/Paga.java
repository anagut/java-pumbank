package com.pumbank.models;

public class Paga {

	private int pdig;
	private int saldo;
	private int frecuencia_dias;
	
	public Paga() {}

	public int getPdig() {
		return pdig;
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

	public Paga(int pdig, int saldo, int frecuencia_dias) {
		super();
		this.pdig = pdig;
		this.saldo = saldo;
		this.frecuencia_dias = frecuencia_dias;
	}
}
