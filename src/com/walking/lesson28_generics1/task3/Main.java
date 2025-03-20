package com.walking.lesson28_generics1.task3;

/**
 * Реализовать класс для работы с массивом.
 * Разработать метод, производящий поиск значения в массиве.
 * Если значение не найдено — выбрасывать исключение.
 * Если найдено — возвращать его.
 */
public class Main {
    public static void main(String[] args) {


            Arrayclass<Integer> arrayinteger = new Arrayclass<>(new Integer[]{1, 2, 3, 4, 5, 7, 8});
            Arrayclass<String> arraystring = new Arrayclass<>(new String[]{"qqq", "www", "eee"});
            Arrayclass<Double> arraydouble = new Arrayclass<>(new Double[]{1.2, 1.5, 1.7});

            System.out.println(arraydouble.findMean(1.2));
            System.out.println(arrayinteger.findMean(5));
            System.out.println(arraystring.findMean("wwwW"));

    }
}

class Arrayclass<T> {
    private T[] array;

    Arrayclass(T[] array) {
        this.array = array;
    }

    public T findMean(T Mean)  {
        for (T a : this.array) {
            if (a.equals(Mean)) {
                return Mean;
            }
        }
        throw new RuntimeException(Mean + " = not found");
    }
}