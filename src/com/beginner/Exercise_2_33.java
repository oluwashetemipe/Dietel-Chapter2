package com.beginner;

import java.util.Scanner;

public class Exercise_2_33 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double weightInPounds;
        double heightInInches;
        System.out.println("Enter your weight in Pounds: ");
        weightInPounds = input.nextDouble();
        System.out.println("Enter your height in Inches: ");
        heightInInches = input.nextDouble();
        double bmi = (weightInPounds * 703)/(heightInInches * heightInInches);
        if(bmi < 18.5){
            System.out.printf("Your Body Mass is %f", bmi);
        }
        if(bmi >= 18.5 && bmi <= 24.9){
            System.out.printf("Your Body Mass is %f", bmi);
        }
        if(bmi >= 25 && bmi <= 29.9){
            System.out.printf("Your Body Mass is %f", bmi);
        }
        if(bmi >= 30){
            System.out.printf("Your Body Mass is %f\n", bmi);
        }
        System.out.println("BMI VALUES\n" +
                           "Underweight:\tless than 18.5\n" +
                           "Normal:     \tbetween 18.5 and 24.9\n" +
                           "Overweight: \tbetween 25 and 29.9\n"+
                           "Obese:      \t30 or greater");
    }
}
