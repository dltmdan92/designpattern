package me.seungmoo.designpattern.headfirst.ch09.iteratorpattern;

import lombok.RequiredArgsConstructor;
import me.seungmoo.designpattern.headfirst.ch09.restaurant.MenuItem;

@RequiredArgsConstructor
public class DinerMenuIterator implements Iterator {
    private final MenuItem[] menuItems;
    private int position;

    @Override
    public boolean hasNext() {
        return position < menuItems.length && menuItems[position] != null;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems[position];
        position++;
        return menuItem;
    }

}
