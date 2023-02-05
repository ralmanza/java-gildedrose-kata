package tv.codely.kata.gildedrose;

public class AgedBrieItem extends Item {
    public AgedBrieItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    void update() {
        if (quality < 50) increaseQuality();

        decreaseSellIn();
        if (sellIn < 0 && quality < 50) increaseQuality();
    }
}
