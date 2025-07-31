package com.walking.lesson29_generics2.task2;

//import java.util.Scanner;

/**
 * Используя Задачу 1 из урока Generics.
 * Часть I, реализуйте в Main метод, принимающий аргументом объект подходящего
 * для дженерика типа и возвращающий объект дженерика.
 * Допустима параметризация только с использованием wildcard.
 */
public class Main {
    public static void main(String[] args) {
        Numbers<Integer> a = new Numbers<>(5);
        Numbers<Double> b = new Numbers<>(1.2);
        //int index = new Scanner(System.in).nextInt();

        System.out.println(wildcard(b).toString());


    }

    private static <T extends Number> Number wildcard(Numbers<?> a) {

        return  a.getNumber();
    }
}

class Numbers<T extends Number> {

    public T number;

    Numbers(T number) {
        this.number = number;
    }

    public double degree(int index) {

        return Math.pow(this.number.doubleValue(), index);
    }

    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }
}
