package dat159.fowler;

public class NewRelease extends Movie {

	public NewRelease(String title, int priceCode) {
		super(title, priceCode);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double determineAmount(Rental each) {
    double thisAmount = 0;
        thisAmount += each.getDaysRented() * 3;
        return thisAmount;
	}
	
	@Override
	public int calcFRP(int days) {
		if (days>1) {
			return 2;
		} else {
			return days;
		}
	}

}
