package com.proiect.classes;

import java.io.Serializable;

public abstract class Vehicul implements IComerciabil, Serializable {

	private static final long serialVersionUID = 1L;
	protected Long id;
	protected String sasiu;
	protected float valoare;
	
	public Vehicul(Long id, String sasiu) {
		if (id != null && id > 0 && sasiu != null) {
			this.id = id;
			this.sasiu = sasiu;
		} else {
			this.id = 1L;
			this.sasiu = "SASIU";
		}
	}
	
	public String getSasiu() {
		return sasiu;
	}
	
	public float getValoare() {
		return valoare;
	}
	public void setValoare(float valoare) throws Exception {
		if (valoare < 0)
			throw new Exception("Valoarea unui vehicul nu poate fi negativa");
		if (valoare < 1)
			throw new Exception("Valoarea unui vehicul nu poate fi subunitara");
		if (valoare < 100)
			throw new Exception("Valoarea unui vehicul nu poate fi mai mica decat 100 u.m");
		this.valoare = valoare;
	}
	
	public abstract int getNrRoti();

	public Long getId() {
		return id;
	}
	
}
