package com.company;

public class Main {

    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4};
        try {
            getElement(numbers);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown  :" + e);
        }

    }

    public static void getElement(int[] arr){
        System.out.println(arr[4]); //ArrayIndexOutOfBoundsException

    }
}
