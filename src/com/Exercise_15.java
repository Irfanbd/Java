package com;


import java.util.Scanner;

public class Exercise_15 {
    public static void main(String[] args) {
        int i,n,sum=0;
        System.out.println("Input number of terms is: ");
        {
            Scanner sc=new Scanner(System.in);
            n=sc.nextInt();
            System.out.println("\n The odd numbers are : ");
            for(i=1;i<=n;i++)
            {
                System.out.println(2*i-1);
                sum+=2*i-1;
            }
            System.out.println("The sum of obb natuarl Number upto"+n+"terms is: "+sum);
        }
    }
}
