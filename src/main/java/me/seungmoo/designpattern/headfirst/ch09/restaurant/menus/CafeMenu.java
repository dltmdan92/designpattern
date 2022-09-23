package me.seungmoo.designpattern.headfirst.ch09.restaurant.menus;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CafeMenu implements Menu {
    private Map<String, MenuItem> menuItems = new HashMap<>();

    public void addItem(String name, String description, boolean vegetarian, double price) {
        menuItems.put(name, new MenuItem(name, description, vegetarian, price));
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }
}
