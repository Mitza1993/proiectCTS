package com.proiect.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.proiect.classes.Autoturism;
import com.proiect.classes.PachetPromotional;
import com.proiect.classes.ParcAuto;
import com.proiect.classes.Vehicul;

/** 
 * Mockito is a popular mock framework which can be used in conjunction with JUnit. Mockito allows you to create and configure mock objects.
 * */


@RunWith(MockitoJUnitRunner.class)
public class TestMockito {
	
	@Mock
	PachetPromotional pachetPromotional;
	@Mock
	Vehicul vehicul;
	
	@Test
	public void testCrearePachetPromotional() {
		pachetPromotional.adauga(vehicul);
		Mockito.verify(pachetPromotional).adauga(vehicul);
	}
	
	@Test
	public void testVindeVehicul() {
		ParcAuto mockParc = Mockito.mock(ParcAuto.class);
		//returneaza vehicului care se va achizitiona atunci cand are loc apelul metodei achizitioneaza() din ParcAuto
		Vehicul car = new Autoturism(1l, "SASIU-1");
		//intai achizitioneaza vehicul => ma asigur ca am ce vinde 
		Mockito.when(mockParc.achizitioneaza(vehicul)).thenReturn(car);
		mockParc.vinde(car);
	}

}
