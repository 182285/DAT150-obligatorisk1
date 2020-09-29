package dat159.fowler;

public class Children extends Movie {

	public Children(String title, int priceCode) {
		super(title, priceCode);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double determineAmount(Rental each) {
        double thisAmount = 0;
        thisAmount += 1.5;
        if (each.getDaysRented() > 3)
            thisAmount += (each.getDaysRented() - 3) * 1.5;
        return thisAmount;
	}

}
