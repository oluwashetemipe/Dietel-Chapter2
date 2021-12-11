package com.beginner;

import java.util.Scanner;

public class Exercise_2_26 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a;
        int b;
        a = input.nextInt();
        System.out.println("Enter a number");
        b = input.nextInt();
        if(a % b == 0 ){
            System.out.println("The first digit is a multiple of the second");
        }
        if(a % b == 1){
            System.out.println("The first digit is not a multiple of the second");
        }
    }
}
