package me.seungmoo.designpattern.headfirst.ch04.pizza.factories;

import me.seungmoo.designpattern.headfirst.ch04.pizza.pizzas.Pizza;
import me.seungmoo.designpattern.headfirst.ch04.pizza.pizzas.chicago.*;

public class ChicagoPizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        // 가변의 영역 -> 팩토리 클래스에 별도로 캡슐화를 진행하였다.
        switch (type) {
            case "cheese" -> pizza = new ChicagoStyleCheesePizza();
            case "greek" -> pizza = new ChicagoStyleGreekPizza();
            case "pepperoni" -> pizza = new ChicagoStylePepperoniPizza();
            case "clam" -> pizza = new ChicagoStyleClamPizza();
            case "veggie" -> pizza = new ChicagoStyleVeggiePizza();
        }
        return pizza;
    }
}
