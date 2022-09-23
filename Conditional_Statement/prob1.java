//Write a Java program to get a number from the user and print whether it is positive or negative
package Conditional_Statement;
import java.util.*;
public class prob1 {
    public static void main ( String args[]){
        System.out.println("Input a number");
        Scanner sc =new Scanner(System.in);
        int num =sc.nextInt();

        if(num>0){
            System.out.println("Positive Number");
        }
        else if(num <0){
            System.out.println("Number is Negative");
        }
        else{
            System.out.println("The number is zero");
        }

    }
}
