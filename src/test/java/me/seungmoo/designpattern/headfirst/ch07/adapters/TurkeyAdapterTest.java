package me.seungmoo.designpattern.headfirst.ch07.adapters;

import me.seungmoo.designpattern.headfirst.ch07.fowls.Duck;
import me.seungmoo.designpattern.headfirst.ch07.fowls.MallardDuck;
import me.seungmoo.designpattern.headfirst.ch07.fowls.Turkey;
import me.seungmoo.designpattern.headfirst.ch07.fowls.WildTurkey;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TurkeyAdapterTest {

    @Test
    @DisplayName("test turkey adapter to duck")
    void turkeyAdapterToDuck() {
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("칠면조가 말하길");
        turkey.gobble();
        turkey.fly();

        System.out.println("\n오리가 말하길");
        testDuck(duck);

        System.out.println("\n칠면조 어댑터가 말하길");
        testDuck(turkeyAdapter);
    }

    void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }

}