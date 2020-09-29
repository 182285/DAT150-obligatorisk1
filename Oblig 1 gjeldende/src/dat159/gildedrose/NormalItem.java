package dat159.gildedrose;

public class NormalItem extends Item2 {

	public NormalItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void decreaseQtyOnQty() {
		if (isLowQuality()) {
			quality--;
		}
	}

}
