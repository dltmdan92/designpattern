package me.seungmoo.designpattern.headfirst.ch04.pizza.ingredients.factories;

import me.seungmoo.designpattern.headfirst.ch04.pizza.ingredients.items.cheese.Cheese;
import me.seungmoo.designpattern.headfirst.ch04.pizza.ingredients.items.clams.Clams;
import me.seungmoo.designpattern.headfirst.ch04.pizza.ingredients.items.dough.Dough;
import me.seungmoo.designpattern.headfirst.ch04.pizza.ingredients.items.pepperoni.Pepperoni;
import me.seungmoo.designpattern.headfirst.ch04.pizza.ingredients.items.sauce.Sauce;
import me.seungmoo.designpattern.headfirst.ch04.pizza.ingredients.items.veggies.Veggies;

/**
 * 추상 팩토리 패턴
 * PizzaStore - 추상 팩토리 클래스
 * 이것을 상속받아서 구상 팩토리 클래스가 실질적인 일을 담당한다.
 */
public interface PizzaIngredientFactory {
    // 추상 팩토리의 메소드를 팩토리 메소드 패턴으로 구현할 때도 종종 있다.
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();
}
