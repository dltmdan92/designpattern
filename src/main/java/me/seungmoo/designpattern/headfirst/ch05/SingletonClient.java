package me.seungmoo.designpattern.headfirst.ch05;

enum EnumSingleton {
    UNIQUE_INSTANCE
}

public class SingletonClient {
    public static void main(String[] args) {
        EnumSingleton singleton = EnumSingleton.UNIQUE_INSTANCE;
        // 여기서 싱글턴 사용
    }
}
