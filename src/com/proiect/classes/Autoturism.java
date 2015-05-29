package com.proiect.classes;

public class Autoturism extends Vehicul {

	private static final long serialVersionUID = 1L;
	
	private ProprietatiVehicul proprietati;
	
	public Autoturism (Long id, String sasiu) {
		super(id, sasiu);
	}
	
	public void setProprietati(ProprietatiVehicul proprietati) {
		this.proprietati = proprietati;
	}
	
	public ProprietatiVehicul getProprietati() {
		return proprietati;
	}
	
	public int getNrRoti() {
		return 4;
	}

	@Override
	public String toString() {
		return "Autoturism [nrRoti=" + getNrRoti() + ((proprietati != null) ? ", proprietati=" + proprietati : "") + ", id=" + id
				+ ", sasiu=" + sasiu + ((valoare != 0) ? ", valoare=" + valoare : "" ) + "]";

	}
	
}
