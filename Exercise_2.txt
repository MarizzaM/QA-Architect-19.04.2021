package com.company;

public class Main {

    public static void main(String[] args) throws IndexOutOfBoundsException{
        int [] numbers = {1, 2, 3, 4};
        
        printElement(numbers, numbers.length);
    }

    public static void printElement (int [] arr, int indexToPrint) {

        if (indexToPrint >= arr.length){
            throw new IndexOutOfBoundsException();
        } else
        System.out.println(arr[indexToPrint]);
    }
}
