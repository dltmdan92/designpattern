package me.seungmoo.designpattern.headfirst.ch04.pizza.pizzas.ny;

import me.seungmoo.designpattern.headfirst.ch04.pizza.pizzas.Pizza;

public class NYStyleGreekPizza extends Pizza {
    public NYStyleGreekPizza() {
        super("뉴욕 스타일 소스와 그릭 피자", "씬 크러스트 도우", "마리나라 소스");
        super.toppings.add("잘게 썬 레지아노 그릭");
    }
}
