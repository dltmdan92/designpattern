package me.seungmoo.designpattern.headfirst.ch01.simuduck;

import me.seungmoo.designpattern.headfirst.ch01.simuduck.actions.fly.FlyRocketPowered;
import me.seungmoo.designpattern.headfirst.ch01.simuduck.ducks.Duck;
import me.seungmoo.designpattern.headfirst.ch01.simuduck.ducks.MallardDuck;
import me.seungmoo.designpattern.headfirst.ch01.simuduck.ducks.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        // 동적으로 액션 할당하기
        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
