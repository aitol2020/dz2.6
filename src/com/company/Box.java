package com.company;

public class Box<T extends Number> implements AddAndGet<T>{


    @Override
    public double plus(T birinchi, T ekinchi) {
        return birinchi.doubleValue() + ekinchi.doubleValue();
    }
}


