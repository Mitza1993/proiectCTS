package com.proiect.tests;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

import com.proiect.classes.ParcAuto;

public class TestCaseSingleton extends TestCase {
	
	ParcAuto singletonParc;
	
	public TestCaseSingleton(String metoda) {
		super(metoda);
	}
	
	@Before
	public void setUp() {
		singletonParc = ParcAuto.getInstance();
	}

	@Test
	public void testSingleton() {
		ParcAuto testParc = ParcAuto.getInstance();
		assertEquals(singletonParc, testParc);
	}

}
