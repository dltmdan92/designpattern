package me.seungmoo.designpattern.headfirst.ch11.dynamicproxy;

import me.seungmoo.designpattern.headfirst.ch11.dynamicproxy.invocationhandlers.NonOwnerInvocationHandler;
import me.seungmoo.designpattern.headfirst.ch11.dynamicproxy.invocationhandlers.OwnerInvocationHandler;

import java.lang.reflect.Proxy;

public class MatchMakingTestDrive {
    Person kim = new PersonImpl("김자바");

    public static void main(String[] args) {
        MatchMakingTestDrive test = new MatchMakingTestDrive();
        test.drive();
    }

    public void drive() {
        Person joe = new PersonImpl("조자바");
        Person ownerProxy = getOwnerProxy(kim);
        System.out.println("이름: " + ownerProxy.getName());
        ownerProxy.setInterests("볼링, 바둑");
        System.out.println("본인 프록시에 관심 사항을 등록합니다.");
        try {
            ownerProxy.setGeekRating(10);
        } catch (Exception e) {
            System.out.println("본인 프록시에는 괴짜 지수를 매길 수 없습니다.");
        }
        System.out.println("괴짜 지수: " + ownerProxy.getGeekRating());
        Person nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.println("이름: " + nonOwnerProxy.getName());
        try {
            nonOwnerProxy.setInterests("볼링, 바둑");
        } catch (Exception e) {
            System.out.println("타인 프록시에는 관심 사항을 등록할 수 없습니다.");
        }
        nonOwnerProxy.setGeekRating(3);
        System.out.println("타인 프록시에 괴짜 지수를 매깁니다.");
        System.out.println("괴짜 지수: " + nonOwnerProxy.getGeekRating());
    }

    /**
     * 동적 프록시 메서드
     * 동적이라고 하는 이유는 프록시 객체의 클래스가 런타임에서 생성되기 때문이다.
     * 실제로 코드가 실행되기 전까지 즉, 컴파일까지는 프록시 클래스는 존재하지 않는다.
     *
     * 보호/동적 프록시의 핵심: 프록시 객체와 InvocationHandler를 통해 특정 객체로의 접근을 제어한다.
     * 접근을 제어하는 로직은 InvocationHandler에서 구현된다.
     *
     * @param person
     * @return
     */
    private Person getOwnerProxy(Person person) {
        // 실제 프록시 객체를 생성한다. (런타임에서 동적으로)
        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person));
    }

    private Person getNonOwnerProxy(Person person) {
        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person));
    }
}
