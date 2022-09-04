package me.seungmoo.designpattern.headfirst.ch05;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private static ChocolateBoiler instance;

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

    public static synchronized ChocolateBoiler getInstance() {
        if (ChocolateBoiler.instance == null) {
            instance = new ChocolateBoiler();
        }
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
