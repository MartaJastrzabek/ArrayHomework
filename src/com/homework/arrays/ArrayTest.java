package com.homework.arrays;

public class ArrayTest {
    public static void main(String[] args) {
        Array array = new Array();
        int[] numbers = array.getUserInput();
        System.out.println(array.getSum(numbers));
    }
}
