package me.seungmoo.designpattern.headfirst.ch03.coffee;

// 상속은 강력하지만 OCP 원칙에는 불리하다. -> 상속보다는 구성(composition)을 사용해보도록 하자.
public abstract class Beverage {

    protected String description;
    protected double milk;
    protected double soy;

    // 고객이 더블 모카를 주문한다면?
    protected double mocha;
    protected double whip;
    // 첨가물이 추가될 때마다 부모클래스의 소스 수정 필요, 또한 cost 메소드도 수정해야 한다.


    public String getDescription() {
        return description;
    }

    // 또한 Beverage클래스의 메서드 로직이 변경되면 모든 자식 클래스들이 영향을 받는다.

    public double cost() {
        // 첨가물의 가격이 바뀔때마다 부모클래스 소스 수정 필요
        return milk * 100 + soy * 200 + mocha * 200 + whip * 150;
    }

    public boolean hasMilk() {
        return milk > 0.0;
    }

    public void setMilk(double milk) {
        this.milk = milk;
    }

    public boolean hasSoy() {
        return soy > 0.0;
    }

    public void setSoy(double soy) {
        this.soy = soy;
    }

    public boolean hasMocha() {
        return mocha > 0.0;
    }

    public void setMocha(double mocha) {
        this.mocha = mocha;
    }

    // Tea 또한 whip 관련 클래스를 상속받아야 한다.
    public boolean hasWhip() {
        return whip > 0.0;
    }

    public void setWhip(double whip) {
        this.whip = whip;
    }
}
