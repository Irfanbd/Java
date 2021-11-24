package com;

import java.util.Scanner;

public class Exercise_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Floating Number:  ");
        double x=sc.nextDouble();
        System.out.println("Enter Second Floating Number:  ");
        double y=sc.nextDouble();
        System.out.println("You Have Entered : "+x+" and "+y);
        x=Math.round(x*1000)/1000.0;
//        x=x/1000;

        y=Math.round(y*1000)/1000.0;
//        y=y/1000;
        if (x==y)
        {
            System.out.println("They are the same up to three decimal places");
        }
        else
        {
            System.out.println("They are Different");
        }
    }
}
