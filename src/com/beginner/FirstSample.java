package com.beginner;
import static java.lang.Math.*;
public class FirstSample {
    //public static final double Cm_Per_Inch = 2.54;
    //if declared public methods of other classes can use it a FirstSample.Cm_Per_Inch
    public static void main(String[] args)
    {
        final double Cm_Per_Inch = 2.54;
        double paper_Width = 8.5;
        double paper_Height = 11;
        System.out.println("Paper size in centimeters: " + paper_Width * Cm_Per_Inch
                + " by " +paper_Height * Cm_Per_Inch);
        double x = 4;
        double y = sqrt(x);
        System.out.println(y);
        int a = 2;
        double p = pow(x,a);
        System.out.println(p);
        System.out.println("The square root of \u03C0 is " + sqrt(PI));
        int n = 123456789;
        float f = n;
        System.out.println(f);
        double w = 9.997;
        int nx = (int)round(w);
        System.out.println("Double " + w + " Integer " + nx);
        String greeting = "Hello";
        String s = greeting.substring(0,3);
        String s2 = greeting.substring(3,5);

        String expletive = "Expletive";
        String PG13 = "PG13";
        String message = expletive + PG13;
        System.out.println(message);

        int age = 13;
        String rating = "PG" + age;
        System.out.println(rating);
        //Spacing is important if using a method like this

        //Joining multiple string together
        String all = String.join("/","s","m","l","xl");
        System.out.println(all);
        //Repeat method
        String repeated = "Java".repeat(2);
        System.out.println(repeated);

        //Testing Strings for equality (s.equals(t))
        "Hello".equals(greeting);

        "Hello".equalsIgnoreCase("hello");
        if (greeting== "Hello"){
            System.out.println(true);
        }
        if (greeting.substring(0,3)== "Hel"){
            System.out.println(true);
        }
        
    }
}
