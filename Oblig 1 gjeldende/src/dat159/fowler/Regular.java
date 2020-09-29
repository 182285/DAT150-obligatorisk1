package dat159.fowler;

public class Regular extends Movie {

	public Regular(String title, int priceCode) {
		super(title, priceCode);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double determineAmount(Rental each) {
		double thisAmount = 0;
        thisAmount += 2;
        if (each.getDaysRented() > 2)
            thisAmount += (each.getDaysRented() - 2) * 1.5;
        return thisAmount;
	}

}
