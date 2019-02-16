package com.pairgood.kata;

public class FizzBuzzCalculator {
    public String Calculate(Integer number) {

        if (number % 3 == 0) {
            return "fizz";
        }

        return number.toString();
    }
}
