package com.pumbank.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="padre")

public class Padre {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pid;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellidos")
	private String apellidos;
	
	@Column(name="fecha_nacimiento")
	private Date fecha_nacimiento;
	
	@Column(name="tarjeta_credito")
	private String tarjeta_credito;
	
	@Column(name="cvv")
	private int cvv;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String contraseña;
	
	@ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "padre_hijo_rel", 
        joinColumns = { @JoinColumn(name = "padre") }, 
        inverseJoinColumns = { @JoinColumn(name = "hijo") }
    )
	private List<Hijx> hijos;

	
	public Padre() {
	}


	public Padre(int pid, String nombre, String apellidos, Date fecha_nacimiento, String tarjeta_credito, int cvv,
			String email, String contraseña, List<Hijx> hijos) {
		super();
		this.pid = pid;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fecha_nacimiento = fecha_nacimiento;
		this.tarjeta_credito = tarjeta_credito;
		this.cvv = cvv;
		this.email = email;
		this.contraseña = contraseña;
		this.hijos = hijos;
	}


	public List<Hijx> getHijos() {
		return hijos;
	}

	public void setHijos(List<Hijx> hijos) {
		this.hijos = hijos;
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

