package me.seungmoo.designpattern.headfirst.ch04.pizza.factories;

import me.seungmoo.designpattern.headfirst.ch04.pizza.pizzas.Pizza;
import me.seungmoo.designpattern.headfirst.ch04.pizza.pizzas.ny.*;

public class NYPizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        // 가변의 영역 -> 팩토리 클래스에 별도로 캡슐화를 진행하였다.
        switch (type) {
            case "cheese" -> pizza = new NYStyleCheesePizza();
            case "greek" -> pizza = new NYStyleGreekPizza();
            case "pepperoni" -> pizza = new NYStylePepperoniPizza();
            case "clam" -> pizza = new NYStyleClamPizza();
            case "veggie" -> pizza = new NYStyleVeggiePizza();
        }
        return pizza;
    }
}
