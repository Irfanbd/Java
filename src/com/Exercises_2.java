package com;

import java.util.Scanner;

public class Exercises_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Number: ");
        int a= sc.nextInt();
        System.out.println("You have Entered :" +a);
        if (a>0)
        {
            System.out.println("The number is positive");
        }
        else if(a<0)
        {
            System.out.println("The number is negative");
        }
        else {
            System.out.println("The number is zero");
        }
    }
}
