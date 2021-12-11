package com.beginner;

import java.util.Scanner;



public class Dowhile {
    public static void main(String[] args) {
        //do while loop
        Scanner object = new Scanner(System.in);
        /*System.out.println("Enter a number");
        int value = object.nextInt();
        while(value!= 5){
            System.out.println("Enter a number");
            value = object.nextInt();
        }*/
        int value = 0;
        do{
            System.out.println("Enter a number");
            value = object.nextInt();
        }
        while (value != 5);


        System.out.println("Got 5!");
    }
}
