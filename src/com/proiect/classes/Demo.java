package com.proiect.classes;

public class Demo {
	
	public static void main(String[] args) {
		try {
			VehiculFactory fabrica = VehiculFactory.getInstance();
			ParcAuto parcAuto = ParcAuto.getInstance();
			
			Autobuz autobuz = (Autobuz) fabrica.fabricaVehicul(TipVehicul.AUTOBUZ, 1, "SASIU1");
			autobuz.setValoare(1234);
			autobuz.setProprietati(new ProprietatiVehicul(2003, "FIAT"));
			
			Autoturism masinaSport = (Autoturism) fabrica.fabricaVehicul(TipVehicul.AUTOTURISM, 2, "SASIU2");
			masinaSport.setValoare(1002);
			masinaSport.setProprietati(new ProprietatiVehicul(2012, "PORSHE"));
			
			
			Autoturism masina4x4 = (Autoturism) fabrica.fabricaVehicul(TipVehicul.AUTOTURISM, 3, "SASIU3");
			masina4x4.setValoare(864);
			masina4x4.setProprietati(new ProprietatiVehicul(2007, "NISSAN"));
			
			Motocicleta motocicleta = (Motocicleta) fabrica.fabricaVehicul(TipVehicul.MOTOCICLETA, 4, "SASIU4");
			motocicleta.setValoare(600);
			motocicleta.setProprietati(new ProprietatiVehicul(2005, "YAMAHA"));
			
			
			parcAuto.achizitioneaza(autobuz);
			parcAuto.achizitioneaza(masinaSport);
			parcAuto.achizitioneaza(masina4x4);
			parcAuto.achizitioneaza(motocicleta);
			
			PachetPromotional promotie = new PachetPromotional();
			promotie.adauga(autobuz);
			
			PachetPromotional promotie2 = new PachetPromotional();
			promotie2.adauga(promotie);
			promotie2.adauga(masina4x4);
			
			parcAuto.vinde(promotie2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
