package com.utez.api.entity;

import java.io.Serializable;

//import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="persona")

public class Persona implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	long personaId;
	String nombres;
	String primerApellido;
	String segundoApellido;
	String RFC;
	String CURP;
	String claveElector;
	String entidadFederativa;
	String municipio;
	String colonia;
	String calle;
	int numInterior;
	int numExterior;
	String correo;
	String fechaRegistro;
	
	public long getPersonaId() {
		return personaId;
	}
	public void setPersonaId(long personaId) {
		this.personaId = personaId;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getPrimerApellido() {
		return primerApellido;
	}
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	public String getSegundoApellido() {
		return segundoApellido;
	}
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	public String getRFC() {
		return RFC;
	}
	public void setRFC(String rFC) {
		RFC = rFC;
	}
	public String getCURP() {
		return CURP;
	}
	public void setCURP(String cURP) {
		CURP = cURP;
	}
	public String getClaveElector() {
		return claveElector;
	}
	public void setClaveElector(String claveElector) {
		this.claveElector = claveElector;
	}
	public String getEntidadFederativa() {
		return entidadFederativa;
	}
	public void setEntidadFederativa(String entidadFederativa) {
		this.entidadFederativa = entidadFederativa;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getColonia() {
		return colonia;
	}
	public void setColonia(String colonia) {
		this.colonia = colonia;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getNumInterior() {
		return numInterior;
	}
	public void setNumInterior(int numInterior) {
		this.numInterior = numInterior;
	}
	public int getNumExterior() {
		return numExterior;
	}
	public void setNumExterior(int numExterior) {
		this.numExterior = numExterior;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
}
