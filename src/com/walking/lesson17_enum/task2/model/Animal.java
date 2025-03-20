package com.walking.lesson17_enum.task2.model;

public enum Animal {
    Dog("woof"), Cow("moo"), Cat("meow");

    private final String sound;

    Animal(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }
}
