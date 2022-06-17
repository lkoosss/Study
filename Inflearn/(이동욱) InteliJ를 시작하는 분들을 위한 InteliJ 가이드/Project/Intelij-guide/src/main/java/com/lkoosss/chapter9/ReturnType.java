package com.lkoosss.chapter9;

public class ReturnType {
    public void print() {
        Integer num = calculate();
        System.out.println(num);
    }

    private Integer calculate() {
        return "1";
    }
}
