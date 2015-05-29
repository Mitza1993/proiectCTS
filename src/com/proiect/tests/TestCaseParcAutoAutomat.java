package com.proiect.tests;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import junit.extensions.TestSetup;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.junit.After;
import org.junit.Before;

import com.proiect.classes.ProprietatiVehicul;
import com.proiect.classes.TipVehicul;
import com.proiect.classes.Vehicul;
import com.proiect.classes.VehiculFactory;

//voi achizitiona vehiculele citite dintr-un fisier text
public class TestCaseParcAutoAutomat extends TestCase {
	
	BufferedReader reader;
	final String fisier = "ParcAuto.txt";
	static VehiculFactory fabrica;
	
	//construire setUp() si tearDown() globale
	public static Test suite() {
		TestSetup setup = new TestSetup(new TestSuite(TestCaseParcAutoAutomat.class)) {
			protected void setUp() {
				setUpGlobal();
			}
			
			protected void tearDown() {
				tearDownGlobal();
			}
		};
		
		return setup;
	}
	
	public static void setUpGlobal () {
		System.out.println("setUpGlobal()");
		fabrica = VehiculFactory.getInstance();
	}
	
	public static void tearDownGlobal() {
		System.out.println("tearDownGlobal()");
	}
	
	//se apeleaza inainte de rularea fiecarui test din testcase
	@Before
	public void setUp() throws FileNotFoundException {
		System.out.println("setUp() => deschide fisier");
		File f = new File (fisier);
		if (!f.exists()) {
			throw new FileNotFoundException();
		}
		reader = new BufferedReader(new FileReader(fisier));
	}
	
	//se apeleaza dupa terminarea apelului fiecarui unittest
	@After
	public void tearDown() throws IOException {
		System.out.println("tearDown() => inchide fisier");
		reader.close();
	}
	
	@org.junit.Test
	public void testFabricareVehicule() throws NumberFormatException, Exception {
		String linie;
		try {
			while ((linie = reader.readLine()) != null) {
				if (linie.startsWith("#")) { //sari peste liniile comentate
					continue; 
				}
				
				if (linie.trim().isEmpty()) { //sari peste liniile goale
					continue;
				}
				
				String [] valori = linie.split("\t");
				
				if (valori.length < 3) {//avem nevoie de tip vehicul, id si sasiu cel putin
					continue;
				}
				
				//procesare si testare valori
				TipVehicul tip;
				try {
					tip = TipVehicul.valueOf(valori[0]); //construire enum
				} catch (Exception exc) {
					continue;
				}
				
				Vehicul vehicul = fabrica.fabricaVehicul(tip, Long.parseLong(valori[1]), valori[2]);
				
				if (valori.length == 4) { //are si pret
					vehicul.setValoare(Float.parseFloat(valori[3]));
				} 
				
				if (valori.length == 6) //are si proprietati
					fabrica.adaugaProprietati(vehicul, new ProprietatiVehicul(Integer.parseInt(valori[4]), valori[5]));
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

}
