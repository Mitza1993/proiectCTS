package com.proiect.classes;

public class Motocicleta extends Vehicul {

	private static final long serialVersionUID = 1L;
	
	private ProprietatiVehicul proprietati;
	
	public Motocicleta (Long id, String sasiu) {
		super(id, sasiu);
	}
	
	public void setProprietati(ProprietatiVehicul proprietati) {
		this.proprietati = proprietati;
	}
	
	public ProprietatiVehicul getProprietati() {
		return proprietati;
	}
	
	public int getNrRoti() {
		return 2;
	}

	@Override
	public String toString() {
		return "Motocicleta [nrRoti=" + getNrRoti() + ((proprietati != null) ? ", proprietati=" + proprietati : "") + ", id=" + id
				+ ", sasiu=" + sasiu + ((valoare != 0) ? ", valoare=" + valoare : "" ) + "]";
	}

}
