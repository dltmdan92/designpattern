package me.seungmoo.designpattern.headfirst.ch09;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class MenuItem {
    private final String name;
    private final String description;
    private final boolean vegetarian;
    private final double price;
}
