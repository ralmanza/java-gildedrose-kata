package tv.codely.kata.gildedrose;

public class StandardItem extends Item {
    public StandardItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    void update() {
        if (quality > 0) decreaseQuality();

        decreaseSellIn();
        if (sellIn < 0 && quality > 0) decreaseQuality();
    }
}
