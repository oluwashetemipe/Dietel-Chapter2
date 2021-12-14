package com.beginner;

import java.util.Scanner;

public class Exercise_2_30 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a 5 numbers: ");
        int digits = input.nextInt();
        int firstNumber;
        if (digits >= 10000 && digits < 100000){
            int secondNumber;
            int thirdNumber;
            int fourthNumber;
            int fifthNumber;
            firstNumber = digits / 10000;
            secondNumber = (digits % 10000) / 1000;
            thirdNumber = (digits % 1000) / 100;
            fourthNumber = (digits % 100) / 10;
            fifthNumber = (digits % 10);
            System.out.printf("%d   %d   %d   %d   %d",firstNumber , secondNumber,thirdNumber,fourthNumber,fifthNumber);
        }
        if (digits < 10000){
            System.out.println("You didn't enter a 5 digit number");
        }
        if (digits >= 100000){
            System.out.println("You didn't enter a 5 digit number");
        }
    }
}
