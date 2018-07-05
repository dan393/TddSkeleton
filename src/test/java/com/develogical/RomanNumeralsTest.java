package com.develogical;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumeralsTest {

    @Test
    public void covertNumeralToString_lessThanFour() {
        RomanNumerals romanNumerals = new RomanNumerals();
        Assert.assertEquals("1 should be I", "I", romanNumerals.convertNumeralToString(1));
        Assert.assertEquals("2 should be II", "II", romanNumerals.convertNumeralToString(2));
        Assert.assertEquals("3 should be III", "III", romanNumerals.convertNumeralToString(3));
    }

    @Test
    public void convertFive()
    {
        RomanNumerals romanNumerals = new RomanNumerals();
        Assert.assertEquals("5 should be V", "V", romanNumerals.convertNumeralToString(5));
    }

    @Test
    public void convertFour()
    {
        RomanNumerals romanNumerals = new RomanNumerals();
        Assert.assertEquals("4 should be IV", "IV", romanNumerals.convertNumeralToString(4));
    }

    @Test
    public void convertNine()
    {
        RomanNumerals romanNumerals = new RomanNumerals();
        Assert.assertEquals("9 should be IX", "IX", romanNumerals.convertNumeralToString(9));
    }

    @Test
    public void convertSixToEight()
    {
        RomanNumerals romanNumerals = new RomanNumerals();
        Assert.assertEquals("8 should be VIII", "VIII", romanNumerals.convertNumeralToString(8));
        Assert.assertEquals("7 should be VII", "VII", romanNumerals.convertNumeralToString(7));
    }

}