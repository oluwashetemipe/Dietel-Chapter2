package com.beginner;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter: ");
        String line = input.nextLine();
        System.out.println("You entered: " + line);
    }
}
