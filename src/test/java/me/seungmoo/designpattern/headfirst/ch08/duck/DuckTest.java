package me.seungmoo.designpattern.headfirst.ch08.duck;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DuckTest {

    @Test
    @DisplayName("duck sort test")
    void testDuckSort() {
        Duck[] ducks = {
                new Duck("Daffy", 8),
                new Duck("Dewey", 2),
                new Duck("Howard", 7),
                new Duck("Louie", 2),
                new Duck("Donald", 10),
                new Duck("Huey", 2),
        };

        System.out.println("정렬 전");
        display(ducks);

        // 정적 템플릿 메서드, compareTo 구현 메서드를 필요로 한다.
        Arrays.sort(ducks);

        System.out.println("\n정렬 후");
        display(ducks);
    }

    private void display(Duck[] ducks) {
        for (Duck duck : ducks) {
            System.out.println(duck);
        }
    }

}