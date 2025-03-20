package com.walking.lesson28_generics1.task2;

/**
 * Создать класс-обертку над объектом любого типа.
 * Предусмотреть boolean-метод, проверяющий значение объекта на null.
 */
public class Main {
    public static void main(String[] args) {
        Wrapper<Integer> wrapperinteger = new Wrapper<>(1);
        System.out.println(wrapperinteger.getType());
        wrapperinteger.setType(2);
        System.out.println(wrapperinteger.getType());
        Wrapper<String> wrapperstring = new Wrapper<>("Hello");
        System.out.println(wrapperstring.getType());
    }
}

class Wrapper<T> {
    private T type;

    Wrapper(T type) {
        this.type = type;
    }

    public void setType(T newmean) {
        this.type = newmean;
    }

    public T getType() {
        return this.type;
    }
}