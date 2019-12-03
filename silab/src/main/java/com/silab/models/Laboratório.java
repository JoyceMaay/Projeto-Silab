package com.silab.models;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Laboratório implements Serializable {
	
	private Long ID;
	private String nomeLaboratorio;
	private String sala;
	private String horario;
	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID = iD;
	}
	public String getNomeLaboratorio() {
		return nomeLaboratorio;
	}
	public void setNomeLaboratorio(String nomeLaboratorio) {
		this.nomeLaboratorio = nomeLaboratorio;
	}
	public String getSala() {
		return sala;
	}
	public void setSala(String sala) {
		this.sala = sala;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}

}
