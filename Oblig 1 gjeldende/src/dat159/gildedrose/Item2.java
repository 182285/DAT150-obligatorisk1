package dat159.gildedrose;

public class Item2 {
String name;
int quality;
int sellIn;

public Item2(String name, int sellIn, int quality) {
    this.name = name;
    this.sellIn = sellIn;
    this.quality = quality;
}

public void decreaseQtyOnQty() {
	//DO NOTHING
}

public void changeSellInOnQty() {
	this.sellIn --;
}

public void changeQtyOnSellIn() {
	
}

public boolean isLowQuality() {
	return quality > 0;
}

public void increaseQtyOnQty() {
	//Do nothin'
}

public boolean isHighQuality() {
	return quality<50;
}

@Override
public String toString() {
    return this.name + ", " + this.sellIn + ", " + this.quality;
}
}
