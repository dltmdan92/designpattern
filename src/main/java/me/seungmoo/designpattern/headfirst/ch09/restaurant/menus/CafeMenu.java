package me.seungmoo.designpattern.headfirst.ch09.restaurant.menus;

import me.seungmoo.designpattern.headfirst.ch09.restaurant.menus.compositepattern.MenuItem;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CafeMenu {
    private Map<String, MenuItem> menuItems = new HashMap<>();

    public void addItem(String name, String description, boolean vegetarian, double price) {
        menuItems.put(name, new MenuItem(name, description, vegetarian, price));
    }

    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }
}
