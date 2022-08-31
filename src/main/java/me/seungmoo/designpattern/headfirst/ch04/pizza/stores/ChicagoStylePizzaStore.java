package me.seungmoo.designpattern.headfirst.ch04.pizza.stores;

import me.seungmoo.designpattern.headfirst.ch04.pizza.ingredients.factories.ChicagoPizzaIngredientFactory;
import me.seungmoo.designpattern.headfirst.ch04.pizza.pizzas.*;

/**
 * 추상 클래스 PizzaStore를 상속받는 Factory class
 */
public class ChicagoStylePizzaStore extends PizzaStore {

    public ChicagoStylePizzaStore() {
        super(new ChicagoPizzaIngredientFactory());
    }

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        switch (type) {
            case "cheese":
                pizza = new CheesePizza("시카고 스타일 피즈 피자", ingredientFactory);
                break;
            case "veggie":
                pizza = new VeggiePizza("시카고 스타일 야채 피자", ingredientFactory);
                break;
            case "clam":
                pizza = new ClamPizza("시카고 스타일 조개 피자", ingredientFactory);
                break;
            case "pepperoni":
                pizza = new PepperoniPizza("시카고 스타일 페퍼로니 피자", ingredientFactory);
                break;
        }

        return pizza;
    }
}
