package com.walking.lesson20_exceptions.task1_catchException;

public class Fail {
    private String name;
    private int size;
    private String type;

    public Fail(String name, int size, String type) {
        this.name = name;
        this.size = size;
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public void getAll() {
        System.out.println("name = " + this.name);
        System.out.println("size = " + this.size);
        System.out.println("type = " + this.type);
    }


}
