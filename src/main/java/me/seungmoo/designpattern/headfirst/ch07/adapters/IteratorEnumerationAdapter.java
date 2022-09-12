package me.seungmoo.designpattern.headfirst.ch07.adapters;

import lombok.RequiredArgsConstructor;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

@RequiredArgsConstructor
public class IteratorEnumerationAdapter<E> implements Enumeration<E> {
    private final Iterator<E> iterator;

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public E nextElement() {
        if (hasMoreElements()) {
            return iterator.next();
        } else {
            throw new NoSuchElementException();
        }
    }
}
