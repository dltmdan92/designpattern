package me.seungmoo.designpattern.headfirst.ch08.beverage;

public abstract class CaffeineBeverageWithHook {

    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    protected void boilWater() {
        System.out.println("물 끓이는 중");
    }
    protected abstract void brew();
    protected void pourInCup() {
        System.out.println("컵에 따르는 중");
    }
    protected abstract void addCondiments();

    /**
     * 후크(hook) 메서드
     * - 하위 클래스가 별도로 구현하지 않는 이상 별다른 행동을 하진 않는다.
     * - 서브클래스에서 필요할 때 오버라이드해서 로직을 넣을 수 있다.
     *
     * @return boolean
     */
    protected boolean customerWantsCondiments() {
        return true;
    }

}
