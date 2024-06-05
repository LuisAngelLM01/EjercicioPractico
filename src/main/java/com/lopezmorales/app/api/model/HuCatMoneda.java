package com.lopezmorales.app.api.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(HuCatMonedaId.class)
public class HuCatMoneda implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
    private Long numCia;

    @Id
    private String claveMoneda;

    @Column(length = 30)
    private String descripcion;

    @Column(length = 5)
    private String simbolo;

    @Column(length = 5)
    private String abreviacion;

    @Column(length = 1)
    private String monedaCorriente;

    @Column(length = 1)
    private String status;
    
    // Gets and Sets
	public Long getNumCia() {
		return numCia;
	}

	public void setNumCia(Long numCia) {
		this.numCia = numCia;
	}

	public String getClaveMoneda() {
		return claveMoneda;
	}

	public void setClaveMoneda(String claveMoneda) {
		this.claveMoneda = claveMoneda;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}

	public String getAbreviacion() {
		return abreviacion;
	}

	public void setAbreviacion(String abreviacion) {
		this.abreviacion = abreviacion;
	}

	public String getMonedaCorriente() {
		return monedaCorriente;
	}

	public void setMonedaCorriente(String monedaCorriente) {
		this.monedaCorriente = monedaCorriente;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
    
}
