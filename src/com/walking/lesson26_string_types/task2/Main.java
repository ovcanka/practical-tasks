package com.walking.lesson26_string_types.task2;

import java.util.Scanner;

/**
 * Реализуйте программу, принимающую с клавиатуры строку,
 * содержащую слова, разделенные пробелом.
 * Выведите в консоль количество уникальных слов в строке.
 * Учтите, что строка может начинаться с пробела.
 * <p>
 * Для упрощения допустим, что в строке не могут использоваться символы,
 * отличные от пробела или русских/английский букв.
 * Помните, что слово может быть введено в разных регистрах.
 */
public class Main {
    public static void main(String[] args) {

        String string1 = new Scanner(System.in).nextLine();

/*
        char char1 = string1.charAt(0);
        if(char1 == ' '){
            System.out.println("true");
        }
*/
        String[] strings = string1.split(" ");

        for (int i = 0; i < strings.length - 1; i++) {
            int index = 0;
            String uniq = strings[i];

            boolean check = check(i, uniq, strings);
            if (check) {
                for (String a : strings) {
                    if (uniq.equals(a)) {
                        index++;
                    }
                }
                System.out.println(uniq + " " + index);
            }
        }

    }

    private static boolean check(int i, String uniq, String[] strings) {
        if (i == 0) {
            return true;
        }

        for (int j = 0; j < i; j++) {
            if (strings[j].equals(uniq)) {
                return false;
            }
        }
        return true;
    }
}
