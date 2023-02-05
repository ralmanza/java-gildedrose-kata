package tv.codely.kata.gildedrose;

public abstract class Item {

    public String name;
    public int sellIn;
    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    abstract void update();

    int sellIn() {
        return sellIn;
    }

    int quality() {
        return quality;
    }

    void decreaseSellIn() {
        sellIn -= 1;
    }

    Boolean hasToBeSoldInLessThan(Integer days) {
        return sellIn < days;
    }

    void increaseQuality() {
        quality += 1;
    }

    void decreaseQuality() {
        quality -= 1;
    }

    void resetQuality() {
        quality = 0;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
