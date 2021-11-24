package com;

import java.util.Scanner;

public class Exercise_13 {
    public static void main(String[] args) {

        System.out.println("Input Number of Terms: ");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for (int i=1;i<= n;i++)
        {
            int m=(i*i*i);
            System.out.println("Number is : "+i+" and Cube of "+i+" is : "+m);
        }
    }
}
