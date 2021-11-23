package com;

import java.util.Scanner;

public class Exercise_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Number");
        int day= sc.nextInt();
        switch (day) {
            case 1 -> System.out.println("Saturday");
            case 2 -> System.out.println("Sunday");
            case 3 -> System.out.println("Monday");
            case 4 -> System.out.println("Tuesday");
            case 5 -> System.out.println("Wednesday");
            case 6 -> System.out.println("Thursday");
            case 7 -> System.out.println("Friday");
            default -> System.out.println("Invalid Input");
        }
    }
}
