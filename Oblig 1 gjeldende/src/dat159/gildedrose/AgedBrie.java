package dat159.gildedrose;

public class AgedBrie extends Item2 {

	public AgedBrie(int sellIn, int quality) {
		super("AgedBrie", sellIn, quality);
	}
	
	@Override
	public void increaseQtyOnQty() {
		quality ++;
	}

}
