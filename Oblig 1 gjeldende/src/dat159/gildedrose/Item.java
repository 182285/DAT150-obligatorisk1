package dat159.gildedrose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }


public void decreaseQuality() {
	// TODO Auto-generated method stub
	
}

public void increaseQuality() {
	// TODO Auto-generated method stub
	
}



public void decreaseSellIn() {
	// TODO Auto-generated method stub
	
}
}