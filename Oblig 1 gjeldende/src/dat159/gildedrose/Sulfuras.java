package dat159.gildedrose;

public class Sulfuras extends Item2 {

	public Sulfuras(int sellIn, int quality) {
		super("Sulfuras", sellIn, quality);
	}
	@Override
	public void increaseQtyOnQty() {
		quality ++;
	}
	
	@Override
	public void changeSellInOnQty() {
		//NOTHING
	}

}
