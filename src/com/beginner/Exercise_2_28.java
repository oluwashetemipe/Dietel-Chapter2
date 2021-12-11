package com.beginner;

import java.util.Scanner;

public class Exercise_2_28 {
    public static void main(String[] args){
        final float pi = (float) Math.PI;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius:");
        int radius = input.nextInt();
        System.out.printf("Diameter of the circle is %d%n", 2 * radius );
        System.out.printf("The circumference of the circle is %f%n", 2 * pi * radius);
        System.out.printf("The area of the circle is %f%n" , pi * Math.pow(radius,2));
    }
}
