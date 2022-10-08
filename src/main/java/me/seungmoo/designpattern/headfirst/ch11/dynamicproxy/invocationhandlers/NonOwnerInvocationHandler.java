package me.seungmoo.designpattern.headfirst.ch11.dynamicproxy.invocationhandlers;

import lombok.RequiredArgsConstructor;
import me.seungmoo.designpattern.headfirst.ch11.dynamicproxy.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RequiredArgsConstructor
public class NonOwnerInvocationHandler implements InvocationHandler {
    private final Person person;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
        try {
            if (method.getName().startsWith("get")) {
                return method.invoke(person, args);
            } else if (method.getName().equals("setGeekRating")) {
                return method.invoke(person, args);
            } else if (method.getName().startsWith("set")) {
                throw new IllegalAccessException();
            }
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
