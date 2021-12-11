package com.beginner;

import java.util.Scanner;

public class Exercise_2_16 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x;
        int y;
        System.out.println("Please enter an integer:");
        x = input.nextInt();
        System.out.println("Please enter another integer:");
        y = input.nextInt();

        if (x == y){
            System.out.println("These numbers are equal");
        }
        if (x > y){
            System.out.println(x + " is larger");
        }
        if (!(x > y)){
            System.out.println(y + " is larger");
        }
    }
}
