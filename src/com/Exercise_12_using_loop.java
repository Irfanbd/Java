package com;

import java.util.Scanner;

public class Exercise_12_using_loop {
    public static void main(String[] args) {
        int i,n,sum=0;
        float avg;
        {
            System.out.println("Input any 5 numbers ");
        }
        for(i=0;i<5;i++)
        {
            Scanner sc= new Scanner(System.in);
            n= sc.nextInt();
            sum+=n;
        }
        avg=sum/5;
        System.out.println("The sum of 5 numbers are : "+sum+" \nThe Average of 5 numbers are: "+avg);
    }
}
