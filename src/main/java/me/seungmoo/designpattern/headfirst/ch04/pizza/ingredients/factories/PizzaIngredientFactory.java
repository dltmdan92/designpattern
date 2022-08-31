package me.seungmoo.designpattern.headfirst.ch04.pizza.ingredients.factories;

import me.seungmoo.designpattern.headfirst.ch04.pizza.ingredients.items.cheese.Cheese;
import me.seungmoo.designpattern.headfirst.ch04.pizza.ingredients.items.clams.Clams;
import me.seungmoo.designpattern.headfirst.ch04.pizza.ingredients.items.dough.Dough;
import me.seungmoo.designpattern.headfirst.ch04.pizza.ingredients.items.pepperoni.Pepperoni;
import me.seungmoo.designpattern.headfirst.ch04.pizza.ingredients.items.sauce.Sauce;
import me.seungmoo.designpattern.headfirst.ch04.pizza.ingredients.items.veggies.Veggies;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();
}
