package me.seungmoo.designpattern.headfirst.ch04.pizza;

public class Test {

    Pizza orderPizza(String type) {
        Pizza pizza;

        // 가변의 영역 -> 캡슐화가 필요하다.
        switch (type) {
            case "cheese" -> pizza = new CheesePizza();
            case "greek" -> pizza = new GreekPizza();
            case "pepperoni" -> pizza = new PepperoniPizza();
            case "clam" -> pizza = new ClamPizza();
            case "veggie" -> pizza = new VeggiePizza();
        }

        // 불변의 영역
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}
