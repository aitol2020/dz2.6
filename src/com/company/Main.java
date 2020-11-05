package com.company;

public class Main {

    public static void main(String[] args) {
        Box<Double, Double> box = new Box<>(6.6,7.6);
        box.print();
    }
}
//Создать обобщенный класс и обобщенный интерфейс и реализовать этот интерфейс классом.
// Ограничить параметры типов классом Number.
// В главном классе создать несколько экземпляров обобщенного класса.