package com.walking.lesson20_exceptions.task1_throwsException;

import com.walking.lesson16_abstract_class_interface.task1_abstract_class.model.EquilateralShape;
import com.walking.lesson16_abstract_class_interface.task1_abstract_class.model.EquilateralTriangle;
import com.walking.lesson16_abstract_class_interface.task1_abstract_class.model.Square;

import java.util.Scanner;

/**
 * Создайте массив, имитирующий простейшую файловую систему и содержащий объекты файлов.
 * <p>
 * Реализуйте класс «Файл» содержит название файла, его размер и тип информации
 * (Текст, изображение, аудио, видео. Рекомендую задать типы информации через Enum).
 * <p>
 * Реализуйте механизм поиска по файлам.
 * Метод, реализующий поиск должен выбрасывать FileNotFoundException, если файл не найден.
 * Если файл с названием, введенным пользователем с клавиатуры,
 * существует – вывести на экран информацию о нем
 * (допустимо использовать переопределенный toString()).
 * Если нет, то выбросьте исключение FileNotFoundException.
 * <p>
 * Подсказка: throws можно использовать в том числе в main().
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter shape's length: ");
            int length = scanner.nextInt();
            if (length < 1) {
                throw new Exception("number<1");
            }
            System.out.print("Enter shape's type:\n 1: Square\n 2: Triangle\n");
            int shapeType = scanner.nextInt();
            if (shapeType != 1 && shapeType != 2) {
                throw new Exception("1 -- 3");
            }
            scanner.close();
        }  catch (Exception e) {
            System.out.println(e.getMessage());
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
