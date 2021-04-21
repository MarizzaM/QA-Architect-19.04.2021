package com.company;

public class PrintString {

    public int printHalf (String s) {

         return s.length()/2;
    }
    public int printHalfAndThrow (String sentence) {

        if (sentence == null){
            throw new NullPointerException("Sentence is null");
        } else {
            return sentence.length()/2;
        }
    }
    public int printHalfAndThrowCustom(String sentence) {

        if (sentence == null){
            throw new WrongHalfStringInput("Sentence is null and you tried to invoke String.length()");
        } else {
            return sentence.length()/2;
        }
    }
}
