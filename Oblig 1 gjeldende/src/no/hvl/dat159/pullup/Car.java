package no.hvl.dat159.pullup;

public abstract class Car {
	private String regNr;

	public Car(String regNr) {
		this.regNr = regNr;
	}

	public double determinePrice(int days) {
		return days * 100.00;
	}
}