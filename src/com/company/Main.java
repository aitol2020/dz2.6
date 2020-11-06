package com.company;

public class Main {

    public static void main(String[] args) {
        Box<Double> box = new Box<>();
        System.out.println(box.plus(45.4,46.4));
    }
}
//Создать обобщенный класс и обобщенный интерфейс и реализовать этот интерфейс классом.
// Ограничить параметры типов классом Number.
// В главном классе создать несколько экземпляров обобщенного класса.