//Take three numbers from the user and print the greatest number.
package Conditional_Statement;

import java.util.Scanner;

public class prob3 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Input first number:");
        int num1 = num.nextInt();

        System.out.println("Input Second number:");
        int num2 = num.nextInt();

        System.out.println("Input Third number:");
        int num3 = num.nextInt();

        if(num1>num2 && num1>num3)
        {
            System.out.println("The Greatest Number is : "+num1);
        }
        else if(num2>num1 && num2>num3)
        {
            System.out.println("The Greatest Number is : " +num2);
        }
        else if (num3 >num1 && num3 > num2)
        {
            System.out.println("The Greatest Number is : "+num3);
        }
    }
    
}
