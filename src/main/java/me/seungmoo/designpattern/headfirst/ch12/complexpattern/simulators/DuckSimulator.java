package me.seungmoo.designpattern.headfirst.ch12.complexpattern.simulators;

import me.seungmoo.designpattern.headfirst.ch12.complexpattern.adapters.GooseAdapter;
import me.seungmoo.designpattern.headfirst.ch12.complexpattern.decorators.QuackCountDecorator;
import me.seungmoo.designpattern.headfirst.ch12.complexpattern.factories.AbstractDuckFactory;
import me.seungmoo.designpattern.headfirst.ch12.complexpattern.factories.CountingDuckFactory;
import me.seungmoo.designpattern.headfirst.ch12.complexpattern.fowls.ducks.Flock;
import me.seungmoo.designpattern.headfirst.ch12.complexpattern.fowls.ducks.Quackable;
import me.seungmoo.designpattern.headfirst.ch12.complexpattern.fowls.gooses.Goose;
import me.seungmoo.designpattern.headfirst.ch12.complexpattern.observers.Quackologist;
import me.seungmoo.designpattern.headfirst.ch12.fowls.ducks.*;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);
    }

    private void simulate(AbstractDuckFactory duckFactory) {
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Flock flockOfMallards = new Flock();
        Quackable mallardDuck1 = duckFactory.createMallardDuck();
        Quackable mallardDuck2 = duckFactory.createMallardDuck();
        Quackable mallardDuck3 = duckFactory.createMallardDuck();
        Quackable mallardDuck4 = duckFactory.createMallardDuck();

        flockOfMallards.add(mallardDuck1);
        flockOfMallards.add(mallardDuck2);
        flockOfMallards.add(mallardDuck3);
        flockOfMallards.add(mallardDuck4);

        // ????????? ?????? ?????? ????????? ?????? ?????? ??? ?????? ?????? ???????????? ?????? ??????
        flockOfDucks.add(flockOfMallards);

        System.out.println("\n?????? ??????????????? ??????: ?????? ??????");
        simulate(flockOfDucks);
        System.out.println("\n?????? ??????????????? ??????: ????????? ??????");
        simulate(flockOfMallards);

        System.out.println("\n?????? ??????????????? ?????? (+?????????)");

        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);

        simulate(flockOfDucks);

        System.out.println("????????? ?????? ??? ??????: " + QuackCountDecorator.getNumberOfQuacks() + " ???");
    }

    /**
     * ???????????? ?????? (Quackable interface)
     * @param duck
     */
    private void simulate(Quackable duck) {
        duck.quack();
    }
}
