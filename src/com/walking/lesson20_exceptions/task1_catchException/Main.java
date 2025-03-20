package com.walking.lesson20_exceptions.task1_catchException;

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
 * Если нет, то выведите сообщение «Искомый файл не существует».
 */
public class Main {
    public static void main(String[] args) {
        Fail fail1 = new Fail("name1", 123, "mp3");
        Fail fail2 = new Fail("name2", 1233, "mp3");
        Fail fail3 = new Fail("name3", 1234, "mp3");
        Fail[] fails = new Fail[]{fail1, fail2, fail3};

        String namefail = new Scanner(System.in).nextLine();
        int index = 0;
        try {
            for (Fail fail : fails) {
                if (namefail.equals(fail.getName())) {
                    fail.getAll();
                    break;
                } else if (index == (fails.length-1)) {
                    throw new RuntimeException();
                }
                index++;
            }
        }
        catch (RuntimeException ex){
            System.out.println("FileNotFoundException");
        }

    }

}

