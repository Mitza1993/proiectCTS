package com.proiect.classes;

import java.util.Date;

public class ProprietatiVehicul {
	private int anulFabricatiei;
	private String marca;
	
	public ProprietatiVehicul() {
	}
	
	public ProprietatiVehicul(int anulFabricatiei, String marca) {
		this.anulFabricatiei = anulFabricatiei;
		this.marca = marca;
	}
	
	public void setAnulFabricatiei(int anulFabricatiei) throws Exception {
		if (anulFabricatiei < 0)
			throw new Exception("exceptie valori negative pentru an fabricatie");
		int anCurent = (new Date(System.currentTimeMillis())).getYear();
		if (anulFabricatiei > anCurent)
			throw new Exception("exceptie valori aberante pentru an fabricatie. Nu poate fi: " + anulFabricatiei);
		
		this.anulFabricatiei = anulFabricatiei;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAnulFabricatiei() {
		return anulFabricatiei;
	}
	public String getMarca() {
		return marca;
	}

	@Override
	public String toString() {
		return "ProprietatiVehicul [anulFabricatiei="
				+ anulFabricatiei + ", marca=" + marca + "]";
	}

}
