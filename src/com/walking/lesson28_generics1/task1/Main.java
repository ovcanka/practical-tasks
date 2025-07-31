package com.walking.lesson28_generics1.task1;

import java.util.Scanner;

/**
 * Создать обобщенный тип, принимающий в себя любого из наследников Number.
 * Создать метод, возводящий значение параметризованного типа в степень,
 * переданную параметром в метод.
 */
public class Main {
    public static void main(String[] args) {
        Numbers<Integer> a = new Numbers<>(5);
        Numbers<Double> b = new Numbers<>(1.2);
        int index = new Scanner(System.in).nextInt();

        System.out.println((int)a.degree(index));
        System.out.println((int)b.degree(index));
    }
}

class Numbers<T extends Number> {

    public T number;

    Numbers(T number) {
        this.number = number;
    }

    public double degree(int index) {

        return Math.pow(this.number.doubleValue(),index);
    }
}
