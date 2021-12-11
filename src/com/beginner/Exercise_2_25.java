package com.beginner;

import java.util.Scanner;

public class Exercise_2_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        if(number % 2 == 0){
            System.out.println("Number is even");
        }
        if(number % 2 == 1){
            System.out.println("Number is odd");
        }
    }
}