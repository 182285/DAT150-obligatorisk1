package dat159.gildedrose;

public class GildedRose2 {

	Item2[] items;

	public GildedRose2(Item[] items) {
		this.items = items;
	}

	public void updateQuality() {
		for (int i = 0; i < items.length; i++) {
			Item2 item = items[i];
//	        	if(!(isBrie(item)&&isBackstage(item))) {
//	        		if(item.isLowQuality()) {
////	                if (item.quality > 0) {
//	                    if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
//	                        item.quality = item.quality - 1;
//	                    }
//	                }
			item.decreaseQtyOnQty();
			item.increaseQtyOnQty();
//	                if (item.quality < 50) {
//	                    item.quality = item.quality + 1;
//
//	                    if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
//	                        if (item.sellIn < 11) {
//	                                item.quality = item.quality + 1;
//	                        }
//
//	                        if (item.sellIn < 6) {
//	                                item.quality = item.quality + 1;
//	                        }
//	                    }
//	                }
//		}

		item.changeSellInOnQty();
		

//		if (item.sellIn < 0) {
//			if (!item.name.equals("Aged Brie")) {
//				if (!item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
//					if (item.quality > 0) {
//						if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
//							item.quality = item.quality - 1;
//						}
//					}
//				} else {
//					item.quality = item.quality - item.quality;
//				}
//			} else {
//				if (item.quality < 50) {
//					item.quality = item.quality + 1;
//				}
//			}
//		}
		item.changeQtyOnSellIn();
	}

	}

	private boolean isBackstage(Item2 item) {
		return item.name.contains("Backstage");
	}

	private boolean isBrie(Item2 item) {
		return item.name.contains("AgedBrie");
	}

	private boolean isSulfuras(Item2 item) {
		return item.name.contains("Sulfuras");
	}

}
