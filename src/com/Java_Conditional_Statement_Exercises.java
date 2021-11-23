package com;
import java.util.*;
public class Java_Conditional_Statement_Exercises {
    public static void main(String[] args) {
Scanner input=new Scanner(System.in);
        System.out.println("Input a: ");
        double a=input.nextDouble();
        System.out.println("Input b: ");
        double b=input.nextDouble();
        System.out.println("Input c: ");
        double c=input.nextDouble();
 double result =b*b-4.0*a*c;
        System.out.println(result);
        if (result>0.0)
        {
            double r1=(-b+Math.pow(result,0.5))/(2.0*a);
            double r2=(-b-Math.pow(result,0.5))/(2.0*a);
            System.out.println("The roots are:" +r1 +"and"+r2);
        }
        else if (result==0.0)
        {
            double r1 = -b/(2.0*a);
            System.out.println("The root is:" +r1 );
        }
        else {
            System.out.println("The equation has no Roots");
        }
    }
}
