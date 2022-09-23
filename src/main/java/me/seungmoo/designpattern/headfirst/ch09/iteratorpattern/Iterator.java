package me.seungmoo.designpattern.headfirst.ch09.iteratorpattern;

import me.seungmoo.designpattern.headfirst.ch09.restaurant.MenuItem;

public interface Iterator {
    boolean hasNext();
    MenuItem next();
}
