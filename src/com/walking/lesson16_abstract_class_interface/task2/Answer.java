package com.walking.lesson16_abstract_class_interface.task2;

public class Answer implements Interface {



    public Answer() {

    }


    public void answer(String s) {
        switch (s) {
            case "Hi":  // Если s равно "Hi"
//                Выводим в консоль "Hello"
                System.out.println("Hello");
//                Вызываем оператор break, чтобы выйти из switch-case
                break;

            case "Bye":
                System.out.println("Good bye");
                break;

            case "How are you":
                System.out.println("How are your doing");
                break;

            default:  // Если значение s не совпадает ни с одним кейсом
                System.out.println("Unknown message");
        }
    }


}
