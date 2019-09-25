package com.example.calculator;

public class Calculator {
    public int first;
    public String operation;
    public int second;

    public Calculator() {
        first = 0;
        operation = "";
        second = 0;
    }

    public int calculate() {
        if(operation.equals("C")) {
            return 0;
        } else if(operation.equals("+")){
            return first + second;
        } else if(operation.equals("-")){
            return first - second;
        } else if(operation.equals("*")){
            return first*second;
        } else if(operation.equals("/")) {
            return first/second;
        } else {
            return second;
        }
    }
}
