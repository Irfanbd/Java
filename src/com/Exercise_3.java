package com;

import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a= sc.nextInt();
        System.out.println("Enter Second Number: ");
        int b= sc.nextInt();
        System.out.println("Enter Third Number: ");
        int c= sc.nextInt();
        System.out.println("You have Entered:\n"+"First Number:"+a+"\n"+"Second Number:"+b+"\n"+"Third Number:"+c);
        if (a>b){
            if (a>c)
            {
                System.out.println("A is Greatest:"+a);
            }
        }
        if (b>a)
        {
            if (b>c)
            {
                System.out.println("B is Greatest:"+b);
            }
        }
        if (c>a)
        {
            if (c>b)
            {
                System.out.println("C is Greatest:"+c);
            }
        }
    }
}
