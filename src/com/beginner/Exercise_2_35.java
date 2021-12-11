package com.beginner;

import java.util.Scanner;

public class Exercise_2_35 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int miles;
        int cost;
        int avgMiles ;
        int parkingFees;
        int tolls;
        System.out.println("Enter number of miles driven per day: ");
        miles = input.nextInt();
        System.out.println("Enter cost($) per gallon of gasoline: ");
        cost = input.nextInt();
        System.out.println("Enter number of average miles per gallon: ");
        avgMiles = input.nextInt();
        System.out.println("Enter cost($) of parking fees per day: ");
        parkingFees = input.nextInt();
        System.out.println("Enter cost($) of tolls fees per day: ");
        tolls = input.nextInt();
        int dailyCost = (miles/avgMiles) * cost + parkingFees + tolls;
        System.out.printf("Your daily driving cost is $%d\n", dailyCost);
    }
}
