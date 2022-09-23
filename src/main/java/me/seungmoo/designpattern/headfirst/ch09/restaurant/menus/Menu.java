package me.seungmoo.designpattern.headfirst.ch09.restaurant.menus;

import java.util.Iterator;

public interface Menu {
    Iterator<MenuItem> createIterator();
}
