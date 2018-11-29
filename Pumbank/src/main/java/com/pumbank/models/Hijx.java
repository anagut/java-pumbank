package com.pumbank.models;

import java.util.Date;

public class Hijx {

	private int hid;
	private int pid;
	private String nombre;
	private String apellidos;
	private Date fecha_nacimiento;
	private int saldo;
	private String email;
	private String contrase�a;
	
	
	public Hijx() {}


	public Hijx(int hid, int pid, String nombre, String apellidos, Date fecha_nacimiento, int saldo, String email,
			String contrase�a) {

		
		this.hid = hid;
		this.pid = pid;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fecha_nacimiento = fecha_nacimiento;
		this.saldo = saldo;
		this.email = email;
		this.contrase�a = contrase�a;
	}


	public int getHid() {
		return hid;
	}


	public void setHid(int hid) {
		this.hid = hid;
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


	public int getSaldo() {
		return saldo;
	}


	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getContrase�a() {
		return contrase�a;
	}


	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	
}
