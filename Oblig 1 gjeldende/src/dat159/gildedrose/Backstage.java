package dat159.gildedrose;

public class Backstage extends Item2 {

	public Backstage(int sellIn, int quality) {
		super("Backstage", sellIn, quality);
	}
	
	@Override
	public void increaseQtyOnQty() {
		if(isHighQuality()) {
			quality ++;
		}
		if(sellIn<11) {
			quality ++;
		}
		if(sellIn<6) {
			quality++;
		}
	}

}
