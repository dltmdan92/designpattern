package me.seungmoo.designpattern.headfirst.ch04.pizza.pizzas.ny;

import me.seungmoo.designpattern.headfirst.ch04.pizza.pizzas.Pizza;

public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        super("뉴욕 스타일 소스와 치즈 피자", "씬 크러스트 도우", "마리나라 소스");
        super.toppings.add("잘게 썬 레지아노 치즈");
    }
}
