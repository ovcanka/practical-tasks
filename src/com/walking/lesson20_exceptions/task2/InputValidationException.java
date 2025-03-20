package com.walking.lesson20_exceptions.task2;

public class InputValidationException extends Exception{
    private int number;

    public InputValidationException(String message, int number){
        super(message);
        this.number = number;
    }
    public Integer getNumber (){
        return number;
    }
}
