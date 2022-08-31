package me.seungmoo.designpattern.headfirst.ch04.pizza.pizzas;

import me.seungmoo.designpattern.headfirst.ch04.pizza.ingredients.items.cheese.Cheese;
import me.seungmoo.designpattern.headfirst.ch04.pizza.ingredients.items.clams.Clams;
import me.seungmoo.designpattern.headfirst.ch04.pizza.ingredients.items.dough.Dough;
import me.seungmoo.designpattern.headfirst.ch04.pizza.ingredients.items.pepperoni.Pepperoni;
import me.seungmoo.designpattern.headfirst.ch04.pizza.ingredients.items.sauce.Sauce;
import me.seungmoo.designpattern.headfirst.ch04.pizza.ingredients.items.veggies.Veggies;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    protected final String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies[] veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clams;
    protected final List<String> toppings = new ArrayList<>();

    protected Pizza(String name) {
        this.name = name;
    }

    public abstract void prepare();
    public void bake() {
        System.out.println("175도에서 25분 간 굽기");
    }
    public void cut() {
        System.out.println("피자를 사선으로 자르기");
    }
    public void box() {
        System.out.println("상자에 피자 담기");
    }

    public String getName() {
        return name;
    }
}
