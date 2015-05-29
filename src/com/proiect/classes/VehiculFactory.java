package com.proiect.classes;


public class VehiculFactory {
	
	private static VehiculFactory instance = new VehiculFactory();
	
	private VehiculFactory () {
		//for the singleton pattern
	}
	
	public static VehiculFactory getInstance () {
		return instance;
	}

	public Vehicul fabricaVehicul (TipVehicul tip, long id, String sasiu) {
		Vehicul v = null;
		switch (tip) {
			case AUTOBUZ:
				v = new Autobuz(id, sasiu);
				break;
			case AUTOTURISM:
				v = new Autoturism(id, sasiu);
				break;
			case MOTOCICLETA:
				v = new Motocicleta(id, sasiu);
				break;
		}
		
		System.out.println("S-a fabricat: " + v.toString());
		
		return v;
	}
	
	public void adaugaProprietati(Vehicul vehicul, ProprietatiVehicul proprietati) {
		if (vehicul instanceof Autobuz) 
			((Autobuz) vehicul).setProprietati(proprietati);
		else if (vehicul instanceof Autoturism)
			((Autoturism) vehicul).setProprietati(proprietati);
		else if (vehicul instanceof Motocicleta)
			((Motocicleta) vehicul).setProprietati(proprietati);
		
		System.out.println("S-au adaugat proprietati vehiculului: " + vehicul.toString());
	}
}
