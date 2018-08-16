package br.com.desireworld.core;

public class Intervalo<T> {
    private T min;
    private T max;

    public T getMin() {
        return min;
    }

    public void setMin(T min) {
        this.min = min;
    }

    public T getMax() {
        return max;
    }

    public void setMax(T max) {
        this.max = max;
    }

    public Intervalo(T min, T max) {
        this.min = min;
        this.max = max;
    }
}
