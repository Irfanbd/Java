package com;

import java.util.Scanner;

public class Exercise_12 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any 5 numbers : ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int d= sc.nextInt();
        int e= sc.nextInt();
        System.out.println("You have Entered:"+a+" "+b+" "+c+" "+d+ " "+e);
        float sum=a+b+c+d+e;
        float avg=sum/5;
        System.out.println("The sum of 5 numbers are : "+sum+" \nThe Average of 5 numbers are: "+avg);
    }
}
