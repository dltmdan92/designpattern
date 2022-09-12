package me.seungmoo.designpattern.headfirst.ch07.adapters;

import lombok.RequiredArgsConstructor;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

@RequiredArgsConstructor
public class EnumerationIteratorAdapter<E> implements Iterator<E> {
    private final Enumeration<E> enumeration;

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public E next() {
        if (hasNext()) {
            return enumeration.nextElement();
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
