package com.beginner;
import java.util.Scanner;

public class Exercise_2_15 {
    public static void main(String[] args){
        int x;
        int y;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer:");
        x = input.nextInt();
        System.out.println("Please enter another integer:");
        y = input.nextInt();
        int sum = x + y;
        int product = x * y;
        int difference = x - y;
        int diff = y - x;
        int division = x / y;
        System.out.println("The sum of the two numbers is " + sum );
        System.out.println("Their product is " + product);
        System.out.println("The difference between the first and last number is " + difference);
        System.out.println("The difference between the last and first number is " + diff);
        System.out.println("The first number divided by the second would give " + division);
    }
}
