package com.company;

public class Box<T, S> extends Number implements AddAndGet<T, S> {

    private T number1;
    private S number2;

    public Box(T number1, S number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public T getNumber1() {
        return number1;
    }

    public S getNumber2() {
        return number2;
    }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }

    @Override
    public void print() {
        System.out.println("First Num = " + getNumber1() + "\nSecond Num = " + getNumber2());
    }
}
