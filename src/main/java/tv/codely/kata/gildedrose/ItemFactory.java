package tv.codely.kata.gildedrose;

public class ItemFactory {
    private static final String AGED_BRIE = "Aged Brie";
    private static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";

    public static Item build(String name, int sellIn, int quality) {
        if (AGED_BRIE.equals(name)) return new AgedBrieItem(name, sellIn, quality);
        if (BACKSTAGE_PASSES.equals(name)) return new BackStageItem(name, sellIn, quality);
        if (SULFURAS.equals(name)) return new SulfurasItem(name, sellIn, quality);

        return new StandardItem(name, sellIn, quality);
    }
}
