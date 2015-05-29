package com.proiect.classes;

import java.util.HashMap;

public class ParcAuto {
	
	private static ParcAuto instance = new ParcAuto();
	
	private HashMap<String, Vehicul> vehicule;
	
	private ParcAuto() {
		vehicule = new HashMap<String, Vehicul>();
	}
	
	public static ParcAuto getInstance() {
		return instance;
	}
	
	public Vehicul achizitioneaza (Vehicul vehicul) {
		System.out.println("Parcul auto a achizitionat: " + vehicul.toString());
		return vehicule.put(vehicul.getSasiu(), vehicul);
	}
	
	public void vinde (IComerciabil vehicul) {
		if (vehicul instanceof PachetPromotional) {
			PachetPromotional promotie = (PachetPromotional) vehicul;
			for (IComerciabil veh : promotie.getListaVehicule()) {
				vinde(veh);
			}
		} else {
			System.out.println("Parcul auto a vandut: " + vehicul.toString());
			vehicule.remove(((Vehicul) vehicul).getSasiu());
		}
	}

}
