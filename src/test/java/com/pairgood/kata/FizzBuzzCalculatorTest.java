package com.pairgood.kata;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzCalculatorTest {

    @Test
    public void Calculate_ForOneItReturnsOne() {
        FizzBuzzCalculator calculator = new FizzBuzzCalculator();

        String actual = calculator.Calculate(1);

        Assert.assertEquals("1", actual);
    }

    @Test
    public void Calculate_ForTwoItReturnsTwo() {
        FizzBuzzCalculator calculator = new FizzBuzzCalculator();

        String actual = calculator.Calculate(2);

        Assert.assertEquals("2", actual);
    }

    @Test
    public void Calculate_ForFourItReturnsFour() {
        FizzBuzzCalculator calculator = new FizzBuzzCalculator();

        String actual = calculator.Calculate(4);

        Assert.assertEquals("4", actual);
    }
}
