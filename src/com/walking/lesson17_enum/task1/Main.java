package com.walking.lesson17_enum.task1;


import com.walking.lesson17_enum.task1.enum_answer.Answer;
import java.util.Scanner;



/**
 * Реализуйте задачу
 * <a href="https://github.com/KFalcon2022/practical-tasks/blob/master/src/com/walking/lesson3/Task2SwitchCase.java">...</a>
 * через enum. В т.ч. реализуйте в enum'е поиск значения по фразе,
 * введенной пользователем. Напоминаю, что enum'ы могут содержать поля.
 */
public class Main {
    public static void main(String[] args) {
//        Создаем сканер для чтения с клавиатуры
        Scanner scanner = new Scanner(System.in);

//        Выводим сообщение "Enter string: " в консоль.
//        Данное сообщение не является обязательным, лишь информирует пользователя,
//        какое действие от него ожидается
        System.out.print("Enter string: ");
//        Объявляем переменную s типа String и записываем в нее значение, введенное с клавиатуры
        String s = scanner.nextLine();

//        Сканер более не используется, ее необходимо закрыть.
//        Зачем - разберемся, когда будем изучать I/O Streams
        scanner.close();




//        Используем конструкцию switch-case для переменной s
        switch (s) {
            case "Hi":  // Если s равно "Hi"
//                Выводим в консоль "Hello"
                System.out.println(Answer.Hello.getAnswer());
//                Вызываем оператор break, чтобы выйти из switch-case
                break;

            case "Bye":
                System.out.println(Answer.Buy.getAnswer());
                break;

            case "How are you":
                System.out.println(Answer.Howareyou.getAnswer());
                break;

            default:  // Если значение s не совпадает ни с одним кейсом
                System.out.println(Answer.Unknown.getAnswer());
        }
    }
}
