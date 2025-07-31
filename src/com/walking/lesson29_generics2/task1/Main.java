package com.walking.lesson29_generics2.task1;

/**
 * Реализуйте обобщенный тип, хранящий параметризованное поле.
 * Также в классе Main реализуйте параметризованый метод,
 * принимает первым параметром объект вашего дженерика,
 * вторым — объект типа, которым параметризован объект первого параметра.
 * Метод должен возвращать значение поля дженерика, если оно != null,
 * в противном случае — возвращать второй параметр.
 */
public class Main {
    public static void main(String[] args) {

        Generic<?> generic = new Generic<>(null);
        System.out.println(returnvalue(generic, "1234"));
    }

    private static <T> T returnvalue(Generic<?> generic, T type) {
        T field = (T) generic.getField();
        if (field != null) {
            return field;
        } else {
            return type;
        }

    }
}

class Generic<T> {

    private T field;

    Generic(T field) {
        this.field = field;
    }


    public T getField() {
        return field;
    }

    public void setField(T field) {
        this.field = field;
    }
}