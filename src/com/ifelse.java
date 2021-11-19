package com;

import java.util.*;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int number = sc.nextInt();
        int number2=sc.nextInt();
        if(number==number2)
        {
            System.out.println("Equal Numbers");
        }
        else {
            if(number>number2)
            {
                System.out.println("Number 1 is Grater");
            }
            else {
                System.out.println("Number 1 is Lesser");
            }
        }
        }
    }

