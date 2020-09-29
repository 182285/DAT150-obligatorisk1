package dat159.gildedrose;

class GildedRose {
	Item[] items;

	public GildedRose(Item[] items) {
		this.items = items;
	}
	

	void updateQuality() {
		for (Item item : items) {
			if (normalItem(item)) {
				if (qualityLow(item)) {
					item.quality = item.quality - 1;
				}
			} else {
				if (qualityHigh(item)) {
					item.quality = item.quality + 1;
					if (isBackstage(item)) {
						if (item.sellIn < 11) {
							item.quality = item.quality + 1;
						}
						if (item.sellIn < 6) {
							item.quality = item.quality + 1;
						}

					}
				}
			}
			if (!isSulfuras(item)) {
				item.sellIn = item.sellIn - 1;
			}
			if (item.sellIn < 0) {
				if (!isBrie(item)) {
					if (!isBackstage(item)) {
						if (qualityLow(item)) {
							if (!isSulfuras(item)) {
								item.quality = item.quality - 1;
							}
						}
					} else { // isBackstage()
						item.quality = item.quality - item.quality;
					}
				} else {
					if (qualityHigh(item)) {
						item.quality = item.quality + 1;
					}
				}
			}
		}
	}

	private boolean isBrie(Item item) {
		return item.name.contains("Brie");
	}

	private boolean isSulfuras(Item item) {
		return item.name.contains("Sulfuras");
	}

	private boolean isBackstage(Item item) {
		return item.name.contains("Backstage");
	}

	private boolean qualityHigh(Item item) {
		return item.quality<50;
	}

	private boolean qualityLow(Item item) {
		return item.quality>0;
	}

	private boolean normalItem(Item item) {
		return !(isBackstage(item)||isBrie(item)|| isSulfuras(item));
	}
}