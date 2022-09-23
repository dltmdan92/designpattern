package me.seungmoo.designpattern.headfirst.ch09.iteratorpattern;

import lombok.RequiredArgsConstructor;
import me.seungmoo.designpattern.headfirst.ch09.restaurant.MenuItem;

import java.util.List;

@RequiredArgsConstructor
public class PancakeMenuIterator implements Iterator {
    private final List<MenuItem> menuItems;
    private int position;


    @Override
    public boolean hasNext() {
        return position < menuItems.size() && menuItems.get(position) != null;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems.get(position);
        position++;
        return menuItem;
    }
}
