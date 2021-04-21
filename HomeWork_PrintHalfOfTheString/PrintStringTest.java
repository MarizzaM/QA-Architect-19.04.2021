package com.company;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class PrintStringTest {

    @Test
    public void printString_printHalf_positive_flow() {
        // arrange
        PrintString myString = new PrintString();
        String s = "bla-bla-blaa";
        int halfSizeOfTheString = myString.printHalf(s);
        assertEquals(6, halfSizeOfTheString);
    }

    @Test (expected = NullPointerException.class)
    public void printString_printHalf_Exception() {
        // arrange
        PrintString myString = new PrintString();
        String s = null;
        myString.printHalf(s);
    }
    @Test
    public void printString_printHalfAndThrow_positive_flow() {
        // arrange
        PrintString myString = new PrintString();
        String s = "bla-bla-blaa";
        int halfSizeOfTheString = myString.printHalfAndThrow(s);
        assertEquals(6, halfSizeOfTheString);
    }

    @Test (expected = NullPointerException.class)
    public void printString_printHalfAndThrow_Exception() {
        // arrange
        PrintString myString = new PrintString();
        String s = null;
        myString.printHalfAndThrow(s);
    }
    @Test
    public void printString_printHalfAndThrowCustom_positive_flow() {
        // arrange
        PrintString myString = new PrintString();
        String s = "bla-bla-blaa";
        int halfSizeOfTheString = myString.printHalfAndThrowCustom(s);
        assertEquals(6, halfSizeOfTheString);
    }

    @Test (expected = WrongHalfStringInput.class)
    public void printString_printHalfAndThrowCustom_rException() {
        // arrange
        PrintString myString = new PrintString();
        String s = null;
        myString.printHalfAndThrowCustom(s);
    }
}
