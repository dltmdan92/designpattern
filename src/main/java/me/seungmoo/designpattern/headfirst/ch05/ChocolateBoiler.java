package me.seungmoo.designpattern.headfirst.ch05;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    // 이렇게 하면 정적 초기화 부분(static initializer)에서 Singleton의 인스턴스를 생성, 이렇게 하면 스레드를 써도 별 문제가 없다.
    private static ChocolateBoiler instance = new ChocolateBoiler();

    private ChocolateBoiler() {
        this.empty = true;
        this.boiled = false;
    }

    public void fill() {
        if (isEmpty()) {
            this.empty = false;
            this.boiled = false;
        }
    }

    public static ChocolateBoiler getInstance() {
        return instance;
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // 끊인 재료를 다음 단계로 넘김
            this.empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // 재료를 끓임
            this.boiled = true;
        }
    }

    private boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
