package com.pumbank.models;

import java.util.Date;

public class Padre {
	private int pid;
	private String nombre;
	private String apellidos;
	private Date fecha_nacimiento;
	private String tarjeta_credito;
	private int cvv;
	private String hijo;
	private String email;
	private String contraseña;
	
	public Padre() {
	}

	public Padre(int pid, String nombre, String apellidos, Date fecha_nacimiento, String tarjeta_credito, int cvv,
			String hijo, String email, String contraseña) {
		super();
		this.pid = pid;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fecha_nacimiento = fecha_nacimiento;
		this.tarjeta_credito = tarjeta_credito;
		this.cvv = cvv;
		this.hijo = hijo;
		this.email = email;
		this.contraseña = contraseña;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getTarjeta_credito() {
		return tarjeta_credito;
	}

	public void setTarjeta_credito(String tarjeta_credito) {
		this.tarjeta_credito = tarjeta_credito;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public String getHijo() {
		return hijo;
	}

	public void setHijo(String hijo) {
		this.hijo = hijo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	
}

