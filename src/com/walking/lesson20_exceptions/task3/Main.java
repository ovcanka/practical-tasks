package com.walking.lesson20_exceptions.task3;

import com.walking.lesson18_instanceof_getClass.Task1.Animal;
import com.walking.lesson18_instanceof_getClass.Task1.Cat;
import com.walking.lesson18_instanceof_getClass.Task1.Cow;
import com.walking.lesson18_instanceof_getClass.Task1.Dog;

/**
 * Реализуйте любой из вариантов задачи в уроке 18.
 * Для ситуации, когда тип животного неизвестен, выбрасывайте собственное исключение UnknownAnimalException.
 * Предка исключения определите самостоятельно.
 * <p>
 * Также предусмотрите валидацию массива животных на содержание пустых элементов.
 * Если таковые существуют – бросьте кастомное исключение ArrayValidationException,
 * которое содержит информацию об индексе массива, содержащем null.
 */
public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{new Cat(), new Dog(), new Cow(), null};
        arrayValidation(animals);
        soundAll(animals);

    }

    private static void soundAll(Animal[] animals) {
        try {
            for (Animal animal : animals) {
                sound(animal);
            }
        } catch (Exception ex1) {
            System.out.println(ex1.getMessage());
        }
    }

    //    Используя поле класса Animal, определяем, какой настоящий класс обрабатываемого объекта
    private static void sound(Animal animal) throws Exception {
        if (animal instanceof Cat) {
            ((Cat) animal).meow();
        } else if (animal instanceof Dog) {
            ((Dog) animal).woof();
        } else if (animal instanceof Cow) {
            ((Cow) animal).moo();
        } else {
            throw new Exception("UnknownAnimalException");
        }
    }

    private static void arrayValidation(Animal[] animals) {
        int index = 0;
        try {
            for (Animal animal : animals) {
                if (animal == null) {
                    throw new ArrayValidationException("ArrayValidationException",index);
                }
                index++;
            }
        } catch (ArrayValidationException ex) {
            System.out.println(ex.getMessage());
            ex.getIndex();
        }
    }
}

