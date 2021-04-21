package com.company;

public class Main {

    public static void main(String[] args){
        PrintString printString = new PrintString();

        String string = null;
        String sentence = "bla-bla-blaa";

        try{
            printString.printHalf(string);
        } catch (NullPointerException ex){
            System.out.println("Exception thrown : " + ex);
        }

        try {
            printString.printHalfAndThrow(string);

        } catch (NullPointerException ex){
            System.out.println(ex);
        }
        printString.printHalf(sentence);

        try {
            printString.printHalfAndThrowCustom(string);
        } catch (WrongHalfStringInput ex){
            System.out.println(ex);
        }
    }
}
