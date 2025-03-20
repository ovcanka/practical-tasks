package com.walking.lesson19_object_methods;


import java.util.Scanner;

/**
 * Реализуйте класс «Машина». Поля допустимо выбрать на свое усмотрение, но необходимо,
 * чтобы по ним можно было однозначно идентифицировать каждую машину.
 * Скажем, в рамках базы ГАИ.
 * <p>
 * Создайте массив машин. Реализуйте максимально эффективную проверку на вхождение машины в ваш массив.
 * Данные для проверки необходимо запрашивать с клавиатуры.
 * <p>
 * Если машина найдена — выведите ее строковое представление в консоль.
 * <p>
 * Опциональное усложнение: номер машины может быть не уникальным.
 */
public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("blue", "123", "bmw");
        Car car2 = new Car("green", "321", "honda");
        Car car3 = new Car("yellow", "2321", "honda");
        Car[] cars = {car1, car2, car3};

        System.out.println("введите цвет");
        String color = new Scanner(System.in).nextLine();
        System.out.println("номер");
        String number = new Scanner(System.in).nextLine();
        System.out.println("модель");
        String model = new Scanner(System.in).nextLine();

        Car user = new Car(color, number, model);

        for (Car a : cars) {
            if (a.equals(user)) {
                System.out.println(user.getColor());
            }
        }
    }
}
