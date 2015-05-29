package com.proiect.classes;

public class Autobuz extends Vehicul {
	
	private static final long serialVersionUID = 1L;
	
	ProprietatiVehicul proprietati;
	
	public Autobuz(Long id, String sasiu) {
		super(id, sasiu);
	}
	
	public void setProprietati(ProprietatiVehicul proprietati) {
		this.proprietati = proprietati;
	}
	
	public ProprietatiVehicul getProprietati() {
		return proprietati;
	}
	
	public int getNrRoti() {
		return 6;
	}

	@Override
	public String toString() {
		return "Autobuz [nrRoti=" + getNrRoti() + ((proprietati != null) ? ", proprietati=" + proprietati : "") + ", id=" + id
				+ ", sasiu=" + sasiu + ((valoare != 0) ? ", valoare=" + valoare : "" ) + "]";
	}

	
}
