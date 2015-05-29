package com.proiect.tests;

import junit.framework.TestCase;

import org.junit.Test;

import com.proiect.classes.PachetPromotional;

public class TestCasePachetPromotional extends TestCase {
	
	@Test
	public void testAdauga() {
		PachetPromotional pachet = new PachetPromotional();
		boolean actual = pachet.adauga(null);
		assertTrue("Nu verifica pachetul inaintea adaugarii in lista", actual == false);
	}

	@Test
	public void testSterge() {
		PachetPromotional pachet = new PachetPromotional();
		boolean actual = pachet.sterge(null);
		assertTrue("Nu verifica pachetul inaintea stergerii in lista", actual == false);
	}
}
