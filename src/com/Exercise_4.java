package com;

import java.util.Scanner;

public class Exercise_4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Number");
        double input = sc.nextDouble();
        if(input>0)
        {
            if (input<1)
            {
                System.out.println("Positive Small Number");
            }
            if (input>1000000)
            {
                System.out.println("Positive Large Number");
            }
            else
            {
                System.out.println("Positive Number");
            }
        }
        else if (input<0)
        {
            if (Math.abs(input)<1)
            {
                System.out.println("Negative Small Number");
            }
            else if(Math.abs(input)>1000000)
            {
                System.out.println("Negative Large Number");
            }

        }
        else {
            System.out.println("Zero");
        }
    }
}


