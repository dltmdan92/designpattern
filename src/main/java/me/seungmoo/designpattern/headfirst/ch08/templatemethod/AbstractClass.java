package me.seungmoo.designpattern.headfirst.ch08.templatemethod;

public abstract class AbstractClass {
    public final void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
        concreteOperation();
        hook();
    }

    protected abstract void primitiveOperation1();
    protected abstract void primitiveOperation2();

    /**
     * fix된 구상 단계 메서드
     * 추상 클래스에서 선언한다.
     */
    final void concreteOperation() {
        // concreteOperation() 코드
    }

    /**
     * hook 메서드
     * - 기본적으로는 아무것도 하지 않는 구상 메서드
     * - 오버라이드 할지 말지는 optional 하다.
     */
    void hook() {}
}
