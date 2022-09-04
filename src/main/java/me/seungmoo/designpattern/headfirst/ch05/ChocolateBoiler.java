package me.seungmoo.designpattern.headfirst.ch05;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private static volatile ChocolateBoiler instance;

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
        // DCL (Double-Checked Locking)을 통해 인스턴스 미생성일때만 동기화한다.
        // 처음에만 동기화, 그 이후에는 lock 걸리지 않는다.
        // BUT CPU 코어의 캐시를 쓰지 못하고 메인메모리에 매번 접근해야 한다는 단점이 있음
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new ChocolateBoiler();
                }
            }
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
