package com.proiect.tests;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

import com.proiect.classes.ProprietatiVehicul;

public class TestCaseProprietatiVehicul extends TestCase {
	
	ProprietatiVehicul proprietati;
	
	@Before
	protected void setUp() throws Exception {
		proprietati = new ProprietatiVehicul();
	}
	
	@Test
	public void testAnFabricatieValoriNegative() {
		try {
			proprietati.setAnulFabricatiei(-123454);
			fail("metoda setAnulFabricatiei() nu arunca exceptie valori negative");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//valori aberante inseamna an fabricatie > an curent
	@Test
	public void testAnFabricatieValoriAberante() {
		try {
			proprietati.setAnulFabricatiei(20153);
			fail("metoda setAnulFabricatiei() nu arunca exceptie valori aberante");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
