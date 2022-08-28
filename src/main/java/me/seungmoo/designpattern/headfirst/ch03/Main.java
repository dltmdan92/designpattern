package me.seungmoo.designpattern.headfirst.ch03;

import me.seungmoo.designpattern.headfirst.ch03.coffee.Beverage;
import me.seungmoo.designpattern.headfirst.ch03.coffee.Espresso;
import me.seungmoo.designpattern.headfirst.ch03.coffee.HouseBlend;
import me.seungmoo.designpattern.headfirst.ch03.coffee.constants.Size;
import me.seungmoo.designpattern.headfirst.ch03.coffee.decorator.Mocha;
import me.seungmoo.designpattern.headfirst.ch03.coffee.decorator.Soy;
import me.seungmoo.designpattern.headfirst.ch03.coffee.decorator.Whip;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Espresso(Size.TALL);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new HouseBlend(Size.GRANDE);
        beverage2 = new Soy(beverage2);
        beverage2 = new Whip(beverage2);
        beverage2 = new Mocha(new Mocha(beverage2));
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend(Size.VENTI);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());

        // 단순히 데코레이터 형식으로만 인스턴스를 생성하는 것은 좀 불편하다.
        // 추후에 팩토리, 빌더 패턴을 통해서 이 부분을 해결할 수 있다.
    }
}
