package com;
import java.util.*;
public class testing {
    public static void main(String args[]){
        System.out.println("Hello");
        System.out.println("Enter His or Her Age :");
        Scanner sc = new Scanner(System.in);
        int age=sc.nextInt();
        
        if(age > 18){
            System.out.println("He/She is Adult");
        }
        else{
            System.out.println("He/She is not Adult");
        }
        
    }
}
