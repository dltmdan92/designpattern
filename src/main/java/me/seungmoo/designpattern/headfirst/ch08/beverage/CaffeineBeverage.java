package me.seungmoo.designpattern.headfirst.ch08.beverage;

public abstract class CaffeineBeverage {

    /**
     * 템플릿 메소드
     * - 어떤 알고리즘의 템플릿(틀) 역할을 함.
     * - 여기서는 카페인 음료를 만드는 알고리즘의 템플릿
     */
    public final void prepareRecipe() {
        // 템플릿 내에서 알고리즘의 각 단계는 메소드로 표현
        // 어떤 클래스는 abstract class에서 표현
        // 또 다른 어떤 클래스는 sub class에서 구현
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    protected void boilWater() {
        System.out.println("물 끓이는 중");
    }
    protected abstract void brew();
    protected void pourInCup() {
        System.out.println("컵에 따르는 중");
    }
    protected abstract void addCondiments();
}
