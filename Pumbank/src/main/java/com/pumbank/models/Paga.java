package com.pumbank.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="paga")

public class Paga {
	
	@Column(name="cantidad")
	private int cantidad;
	
	@Column(name="frecuencia_dias")
	private int frecuencia_dias;
	
	@Column(name="padre")
	private int pid;
	
	@Column(name="hijo")
	private int hid;
	
	public Paga() {}
	
	

	

}
