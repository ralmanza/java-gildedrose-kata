package tv.codely.kata.gildedrose;

public class BackStageItem extends Item {
    public BackStageItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    void update() {
        if (quality < 50) increaseQuality();
        if (quality < 50 && sellIn < 11) increaseQuality();
        if (quality < 50 && sellIn < 6) increaseQuality();

        decreaseSellIn();
        if (sellIn < 0) resetQuality();
    }
}
