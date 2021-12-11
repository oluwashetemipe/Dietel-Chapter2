package com.beginner;

import java.util.Scanner;

public class Exercise_2_24 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        int c;
        int d;
        int e;
        System.out.println("Enter a number:");
        a = input.nextInt();
        System.out.println("Enter a number:");
        b = input.nextInt();
        System.out.println("Enter a number:");
        c = input.nextInt();
        System.out.println("Enter a number:");
        d = input.nextInt();
        System.out.println("Enter a number:");
        e = input.nextInt();
        if( a == b && b == c && c == d && d == e ){
            System.out.println( "All digits are the same" );
        }

        if( a < b && a < c && a < d && a < e){
            System.out.println(a + " is the smallest" );
        }
        if( a > b && a > c && a > d && a > e){
            System.out.println(a + " is the largest" );
        }
        if( b < a && b < c && b < d && b < e ){
            System.out.println(b + " is the smallest" );
        }
        if( b > a && b > c && b > d && b > e ){
            System.out.println(b + " is the largest" );
        }
        if( c < a && c < b && c < d && c < e ){
            System.out.println(c + " is the smallest" );
        }
        if( c > a && c > b && c > d && c > e ){
            System.out.println(c + " is the largest" );
        }
        if( d < a && d < b && d < c && d < e ){
            System.out.println(d + " is the smallest" );
        }
        if( d > a && d > b && d > c && d > e ){
            System.out.println(d + " is the largest" );
        }
        if( e < a && e < b && e < c && e < d ){
            System.out.println(e + " is the smallest" );
        }
        if( e > a && e > b && e > c && e > d ){
            System.out.println(e + " is the largest" );
        }

    }

}
