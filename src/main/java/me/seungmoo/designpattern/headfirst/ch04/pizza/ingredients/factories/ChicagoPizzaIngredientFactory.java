package me.seungmoo.designpattern.headfirst.ch04.pizza.ingredients.factories;

import me.seungmoo.designpattern.headfirst.ch04.pizza.ingredients.items.cheese.Cheese;
import me.seungmoo.designpattern.headfirst.ch04.pizza.ingredients.items.cheese.ReggianoCheese;
import me.seungmoo.designpattern.headfirst.ch04.pizza.ingredients.items.clams.Clams;
import me.seungmoo.designpattern.headfirst.ch04.pizza.ingredients.items.clams.FreshClams;
import me.seungmoo.designpattern.headfirst.ch04.pizza.ingredients.items.dough.Dough;
import me.seungmoo.designpattern.headfirst.ch04.pizza.ingredients.items.dough.ThinCrustDough;
import me.seungmoo.designpattern.headfirst.ch04.pizza.ingredients.items.pepperoni.Pepperoni;
import me.seungmoo.designpattern.headfirst.ch04.pizza.ingredients.items.pepperoni.SlicedPepperoni;
import me.seungmoo.designpattern.headfirst.ch04.pizza.ingredients.items.sauce.MarinaraSauce;
import me.seungmoo.designpattern.headfirst.ch04.pizza.ingredients.items.sauce.Sauce;
import me.seungmoo.designpattern.headfirst.ch04.pizza.ingredients.items.veggies.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{ new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
