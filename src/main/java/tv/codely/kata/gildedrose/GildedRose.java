package tv.codely.kata.gildedrose;

import java.util.*;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        Arrays.stream(items)
                .forEach(Item::update);
    }
}
