package no.hvl.dat159.pullup;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarTest {
	String id = "harcoded";
	Car sedan = new Sedan(id);
	Car coupe = new Coupe(id);
	Car pickup = new Pickup(id);

	@Test
	void test() {
		assertTrue(sedan.determinePrice(1) == 120.00);
		assertTrue(pickup.determinePrice(1) == 150);
		assertTrue(coupe.determinePrice(1) == 100.0);
	}

}
