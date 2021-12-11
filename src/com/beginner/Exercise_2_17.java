package com.beginner;

import java.util.Scanner;

public class Exercise_2_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.println("Enter your first integer:");
        a =  input.nextInt();
        System.out.println("Enter your second integer");
        b = input.nextInt();
        System.out.println("Enter your third integer");
        c = input.nextInt();

        int sum = a + b + c;
        int avg = (a + b + c)/3;
        int product = a * b * c;
        System.out.println("sum is " + sum + ", average is " + avg + ", and product is " + product);
        if (a > b && a > c ) {
            System.out.println(a + " is the largest" );
        }
        if (b > a && b > c) {
            System.out.println(b + " is the largest");
        }
        if (c > a && c > b){
            System.out.println(c + " is the largest");
        }
        if (a < b && a < c ) {
            System.out.println(a + " is the smallest");
        }
        if (b < a && b < c) {
            System.out.println(b + " is the smallest");
        }
        if (c < a && c < b){
            System.out.println(c + " is the smallest");
        }
        if (a == b && b == c ){
            System.out.println("All digits are the same");
        }

    }
}
