package com.homework.arrays;

import java.util.Scanner;

public class Array {

    public int[] getUserInput(){
        Scanner in = new Scanner(System.in);

        System.out.println("Type 5 integer numbers: ");

        int[] numbers = new int[5];
        numbers[0]= in.nextInt();
        in.nextLine();
        numbers[1]= in.nextInt();
        in.nextLine();
        numbers[2]= in.nextInt();
        in.nextLine();
        numbers[3]= in.nextInt();
        in.nextLine();
        numbers[4]= in.nextInt();

        in.close();

        return numbers;
    }

    public int sum(int[] numbers){
        return numbers[0] + numbers[2] + numbers[4];
    }

    public String getSum(int[] numbers){
        return "Sum of numbers " + numbers[0] + ", " + numbers[2] + " and " + numbers[4] + " is: " + sum(numbers);
    }
}
