package com;

import java.util.Scanner;

public class Exercise_14 {
    public static void main(String[] args) {
int j,n;
        System.out.println("Input The Number:(Table To Be Calculated):");
        {
            System.out.println("Input number of terms: ");
            Scanner sc = new Scanner(System.in);
            n=sc.nextInt();
            System.out.println("\n");
            for (j=0;j<=n;j++)
            {
                System.out.println(n+"X"+j+"="+n*j);
            }
        }
    }
}
