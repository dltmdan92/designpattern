package me.seungmoo.designpattern.headfirst.ch08.beverage.withhook;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HookTest {

    @Test
    @DisplayName("hook code test")
    void testHookCode() {
        TeaWithHook teaHook = new TeaWithHook();
        CoffeeWithHook coffeeHook = new CoffeeWithHook();

        System.out.println("\n홍차 준비 중");
        teaHook.prepareRecipe();

        System.out.println("\n커피 준비 중");
        coffeeHook.prepareRecipe();
    }

}