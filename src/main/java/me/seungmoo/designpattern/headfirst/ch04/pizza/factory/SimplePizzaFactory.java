package me.seungmoo.designpattern.headfirst.ch04.pizza.factory;

import me.seungmoo.designpattern.headfirst.ch04.pizza.pizzas.*;

/**
 * 객체 생성을 담당하는 팩토리 객체의 클래스
 * 해당 방식 말고도 static 팩토리 메서드를 활용하는 방법 또한 있다.
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;
        // 가변의 영역 -> 팩토리 클래스에 별도로 캡슐화를 진행하였다.
        switch (type) {
            case "cheese" -> pizza = new CheesePizza();
            case "greek" -> pizza = new GreekPizza();
            case "pepperoni" -> pizza = new PepperoniPizza();
            case "clam" -> pizza = new ClamPizza();
            case "veggie" -> pizza = new VeggiePizza();
        }
        return pizza;
    }

}
