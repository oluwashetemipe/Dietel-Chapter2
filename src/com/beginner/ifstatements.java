package com.beginner;

public class ifstatements {
    public static void main(String[] args) {
        boolean cond = 5 == 7;// assignment -- =, test for equality -- ==
        int myInt = 15;
        /*if (myInt < 10){
            System.out.println("Yes it's true");
        }
        else if(myInt > 20){
            System.out.println("No, it's false!");
        }
        else {
            System.out.println("None of the above");
        }*/
        int loop = 0;
        while (true){
            System.out.println("Looping: " + loop);
            /*loop++;*/
            if (loop == 5){
                break;
            }
            loop++;
            System.out.println("Running");
        }
    }
}
