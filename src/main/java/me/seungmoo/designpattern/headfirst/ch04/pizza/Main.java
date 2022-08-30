package me.seungmoo.designpattern.headfirst.ch04.pizza;

import me.seungmoo.designpattern.headfirst.ch04.pizza.pizzas.Pizza;
import me.seungmoo.designpattern.headfirst.ch04.pizza.stores.NYStylePizzaStore;
import me.seungmoo.designpattern.headfirst.ch04.pizza.stores.PizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYStylePizzaStore();

        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("에단이 주문한 " + pizza.getName() + "\n");

        pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("조엘이 주문한 " + pizza.getName() + "\n");
    }
}
