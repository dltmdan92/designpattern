package me.seungmoo.designpattern.headfirst.ch08.duck;

import lombok.RequiredArgsConstructor;

/**
 * 정적 템플릿 메서드인 Arrays.sort()는
 * Comparable 인터페이스를 구현하는 구상클래스가 구현한 compareTo() 메서드를 사용한다.
 */
@RequiredArgsConstructor
public class Duck implements Comparable<Duck> {
    private final String name;
    private final int weight;

    @Override
    public String toString() {
        return name + " 체중: " + weight;
    }

    @Override
    public int compareTo(Duck otherDuck) {
        if (this.weight < otherDuck.weight) {
            return -1;
        } else if (this.weight == otherDuck.weight) {
            return 0;
        } else {
            return 1;
        }
    }
}
