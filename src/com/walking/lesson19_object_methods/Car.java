package com.walking.lesson19_object_methods;

public class Car {
    String color;
    final String number;
    final String model;


    public Car(String color, String number, String model) {
        this.color = color;
        this.number = number;
        this.model = model;
    }

    public String getColor() {
        return this.color;
    }

    public String getNumber() {
        return this.color;
    }

    public String getModel() {
        return this.color;
    }

    public boolean equals(Car user) {
        if (!this.color.equals(user.color)){return false;}
        if (!this.number.equals(user.number)){return false;}
        if (!this.model.equals(user.model)){return false;}
        return true;
    }

}
