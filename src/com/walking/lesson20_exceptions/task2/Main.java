package com.walking.lesson20_exceptions.task2;

import com.walking.lesson16_abstract_class_interface.task1_abstract_class.model.EquilateralShape;
import com.walking.lesson16_abstract_class_interface.task1_abstract_class.model.EquilateralTriangle;
import com.walking.lesson16_abstract_class_interface.task1_abstract_class.model.Square;

import java.util.Scanner;

/**
 * Реализуйте любой из вариантов Задачи 1 в уроке 16.
 * При некорректном вводе с клавиатуры выбрасывайте собственное исключение InputValidationException.
 * Не забудьте указать в описании, какой именно из вводов был некорректен -
 * message исключения должен быть информативным.
 * Предка исключения определите самостоятельно.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter shape's length: ");
            int length = scanner.nextInt();
            if (length < 1) {
                throw new InputValidationException("число не может быть меньше", length);
            }
            System.out.print("Enter shape's type:\n 1: Square\n 2: Triangle\n");
            int shapeType = scanner.nextInt();
            if (shapeType != 1 && shapeType != 2) {
                throw new InputValidationException("Число может быть только 1 или 2", shapeType);
            }
            scanner.close();
        }  catch (InputValidationException e) {
            System.out.println(e.getMessage());
            System.out.println("ваше число = " + e.getNumber());
        }
//        Корректнее валидировать значение сразу после ввода. Здесь проверка вынесена после
//        ради демонстрации ситуации, когда скобки в условном выражении действительно необходимы


        //    String shapeString = createShapeString(length, shapeType);
        //    System.out.println(shapeString);
    }

    private static String createShapeString(int length, int type) {
        EquilateralShape shape;

        switch (type) {
            case 1:
                shape = new Square(length);
                break;
            case 2:
                shape = new EquilateralTriangle(length);
                break;
            default:
                return "Unknown shape";
        }

        return shape.createShapeString();
    }
}
