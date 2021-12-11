package com.beginner;

import java.util.Scanner;

public class Exercise_2_34 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter current world population: ");
        long currentWorldPopulation = input.nextLong();
        System.out.println("Enter annual increase rate(%): ");
        double annualIncreaseRate = input.nextDouble();
        long firstYear = (long) (currentWorldPopulation + ((annualIncreaseRate/100) * currentWorldPopulation));
        long secondYear = (long) (firstYear + ((annualIncreaseRate/100) + firstYear));
        long thirdYear = (long) (secondYear + ((annualIncreaseRate/100) + secondYear));
        long fourthYear = (long) (thirdYear + ((annualIncreaseRate/100) + thirdYear));
        long fifthYear = (long) (fourthYear + ((annualIncreaseRate/100) + fourthYear));

        System.out.println("World Population in the next one year is " + firstYear +"\n" +
                           "World Population in the next two years is " + secondYear +"\n" +
                           "World Population in the next three years is " + thirdYear +"\n" +
                           "World Population in the next four years is " + fourthYear +"\n" +
                           "World Population in the next five years is " + fifthYear);

    }
}
