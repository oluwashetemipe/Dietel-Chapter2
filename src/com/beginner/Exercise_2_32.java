package com.beginner;

import java.util.Scanner;

public class Exercise_2_32 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number;
        int secondNumber;
        int thirdNumber;
        int fourthNumber;
        int fifthNumber;
        int negatives = 0;
        int positives = 0;
        int zeros = 0;
        System.out.println("Enter a number: ");
        number = input.nextInt();
        System.out.println("Enter a number: ");
        secondNumber = input.nextInt();
        System.out.println("Enter a number: ");
        thirdNumber = input.nextInt();
        System.out.println("Enter a number: ");
        fourthNumber = input.nextInt();
        System.out.println("Enter a number: ");
        fifthNumber = input.nextInt();
        if(number == 0) {
            zeros++;
        }
        if (number > 0){
            positives++;
        }
        if(number < 0){
            negatives++;
        }
        if(secondNumber == 0) {
            zeros++;
        }
        if (secondNumber > 0){
            positives++;
        }
        if(secondNumber < 0){
            negatives++;
        }
        if(thirdNumber == 0) {
            zeros++;
        }
        if (thirdNumber > 0){
            positives++;
        }
        if(thirdNumber < 0){
            negatives++;
        }
        if(fourthNumber == 0) {
            zeros++;
        }
        if (fourthNumber > 0){
            positives++;
        }
        if(fourthNumber < 0){
            negatives++;
        }
        if(fifthNumber == 0) {
            zeros++;
        }
        if (fifthNumber > 0){
            positives++;
        }
        if(fifthNumber < 0){
            negatives++;
        }
        System.out.printf("You have inputted %d zero numbers, %d negative numbers and %d positive numbers", zeros, negatives, positives);
    }
}
