package com.walking.lesson20_exceptions.task3;

public class ArrayValidationException extends Exception{
    private int index;
    public ArrayValidationException(String massage,int index){
        super(massage);
        this.index = index;
    }
    public void getIndex (){
        System.out.println(this.index);
    }
}
