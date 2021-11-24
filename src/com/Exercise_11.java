package com;

import java.util.Scanner;

public class Exercise_11 {

    public static void main(String[] args) {
        int sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Input the Number: ");
        int n= sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            System.out.println(i);
            sum+=i;
        }
        System.out.println("The Sum of Natural Number upto "+n+" terms: "+sum);
    }
}
