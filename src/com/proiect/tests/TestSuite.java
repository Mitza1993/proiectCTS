package com.proiect.tests;

import junit.framework.Test;

public class TestSuite extends junit.framework.TestSuite {
	
	//la rulare TestSuite se vor rula defapt toate testcaseurile si unittestele adaugate in colectie
	public static Test suite() {
		TestSuite colectie = new TestSuite();
		//adaugare in tottalitate a TestCase-urilor
		colectie.addTestSuite(TestCaseParcAutoAutomat.class);
		colectie.addTestSuite(TestCasePachetPromotional.class);
		colectie.addTestSuite(TestCaseProprietatiVehicul.class);
		
		//adaugare metode selectate din test case-uri
		colectie.addTest(new TestCaseSingleton("testSingleton"));
		colectie.addTest(new TestCaseVehicul("testConstructorNULL"));
		colectie.addTest(new TestCaseVehicul("testSetPretValoriNegative"));
		
		return colectie;
	}


}
