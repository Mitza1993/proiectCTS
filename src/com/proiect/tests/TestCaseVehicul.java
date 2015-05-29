package com.proiect.tests;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.proiect.classes.Autobuz;
import com.proiect.classes.Autoturism;
import com.proiect.classes.Motocicleta;
import com.proiect.classes.Vehicul;

public class TestCaseVehicul extends TestCase {
	
	Vehicul vehicul;
	
	public TestCaseVehicul(String numeMetoda) {
		// used for Test Suite
		super(numeMetoda);
	}

	@Before
	public void setUp() throws Exception {
		vehicul = new Autoturism (1L, "SASIU1");
		System.out.println("Call setUp()");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Call tearDown()");
	}
	
	@Test
	public void testConstructorNULL() {
		vehicul = new Autobuz(null, null);
		assertTrue("Constructorul nu verifica parametrii primiti", vehicul.getSasiu() != null && vehicul.getId() != null);
	}

	@Test
	public void testSetPretValoriNegative() {
		try {
			vehicul.setValoare(-300);
			fail("Metoda setPret() nu arunca exceptie valori negative");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//valori aberante intre 0 si 1
	@Test
	public void testSetPretValoriAberante1() {
		try {
			vehicul.setValoare(0.000056f);
			fail("Metoda setPret() nu arunca exceptie valori negative");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//valori aberante < 100 um
	@Test
	public void testSetPretValoriAberante100() {
		try {
			vehicul.setValoare(80);
			fail("Metoda setPret() nu arunca exceptie valori negative");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testNumarRotiAutoturism() {
		Vehicul dacie = new Autoturism(1L, "SASIU");
		assertEquals("Autoturismul are 4 roti", 4, dacie.getNrRoti());
	}
	
	@Test
	public void testNumarRotiAutobuz() {
		Vehicul autobuz = new Autobuz(1l, "SASIU");
		assertEquals("Autobuzul are 6 roti", 6, autobuz.getNrRoti());
	}
	
	@Test
	public void testNumarRotiMotocicleta() {
		Vehicul motoreta = new Motocicleta(1L, "SASIU");
		assertEquals("Autoturismul are 2 roti", 2, motoreta.getNrRoti());
	}

}
