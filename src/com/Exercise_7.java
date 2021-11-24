package com;

import java.util.Scanner;

public class Exercise_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number_of_days_in_month=0;
        String MonthName="Unknown";
        System.out.println("Input any Month number: ");
        int month= sc.nextInt();
        System.out.println("Input any Year : ");
        int year= sc.nextInt();
        switch (month) {
            case 1 -> {
                MonthName = "January";
                number_of_days_in_month = 31;
            }
            case 2 -> {
                MonthName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    number_of_days_in_month = 29;
                } else {
                    number_of_days_in_month = 28;
                }
            }
            case 3 -> {
                MonthName = "March";
                number_of_days_in_month = 31;
            }
            case 4 -> {
                MonthName = "April";
                number_of_days_in_month = 31;
            }
            case 5 -> {
                MonthName = "May";
                number_of_days_in_month = 31;
            }
            case 6 -> {
                MonthName = "June";
                number_of_days_in_month = 31;
            }
            case 7 -> {
                MonthName = "July";
                number_of_days_in_month = 31;
            }
            case 8 -> {
                MonthName = "August";
                number_of_days_in_month = 31;
            }
            case 9 -> {
                MonthName = "September";
                number_of_days_in_month = 31;
            }
            case 10 -> {
                MonthName = "October";
                number_of_days_in_month = 31;
            }
            case 11 -> {
                MonthName = "November";
                number_of_days_in_month = 31;
            }
            case 12 -> {
                MonthName = "December";
                number_of_days_in_month = 31;
            }
        }
        System.out.println(MonthName+" "+ year+" has "+ number_of_days_in_month+" days\n");
   }
}
