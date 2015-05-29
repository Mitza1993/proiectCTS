package com.proiect.classes;

import java.util.ArrayList;
import java.util.List;

public class PachetPromotional implements IComerciabil {
	
	private List<IComerciabil> listaVehicule;
	private float pret;
	
	public PachetPromotional() {
		this.listaVehicule = new ArrayList<IComerciabil>();
		this.pret = 0;
	}
	
	public boolean adauga (IComerciabil vehicul) {
		if (vehicul != null) {
			this.pret += vehicul.getValoare();
			this.listaVehicule.add(vehicul);
			return true;
		} 
		return false;
	}
	
	public boolean sterge (IComerciabil vehicul) {
		if (vehicul != null) {
			this.listaVehicule.remove(vehicul);
			return true;
		}
		return false;
	}

	public List<IComerciabil> getListaVehicule() {
		return listaVehicule;
	}

	public float getValoare() {
		// TODO Auto-generated method stub
		return pret;
	}
}
