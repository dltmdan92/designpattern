package me.seungmoo.designpattern.headfirst.ch04.pizza.pizzas.chicago;

import me.seungmoo.designpattern.headfirst.ch04.pizza.pizzas.Pizza;

public class ChicagoStyleClamPizza extends Pizza {

    public ChicagoStyleClamPizza() {
        super("시카고 스타일 딥 디쉬 클램 피자", "아주 두꺼운 크러스트 도우", "플럼토마토 소스");
        super.toppings.add("잘게 조각낸 클램");
    }

    @Override
    public void cut() {
        System.out.println("네모난 모양으로 피자 자르기");
    }
}
