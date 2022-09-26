// Write a Java program to solve quadratic equations (use if, else if and else). Go to the editor

//Test Data
//Input a: 1
//Input b: 5
//Input c: 1
package Conditional_Statement;

import java.util.Scanner;

public class prob2 {
    public static void main(String args[]) {
        Scanner input = new Scanner("System.in");
        System.out.println("input a");
        double a = input.nextDouble();

        System.out.println("input b");
        double b = input.nextDouble();

        System.out.println("input c");
        double c = input.nextDouble();

        double result = b * b - 4.0 * a * c;

        if (result > 0.0) {
            double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
            double r2 = (b + Math.pow(result, 0.5)) / (2.0 * a);
            System.out.println("The Roots Are:" + r1 + "and" + r2);
        } else if (result == 0.0) {
            double r1 = -b / (2.0 * a);
            System.out.println("The root is " + r1);
        } else {
            System.out.println("The equation has no real roots.");
        }
        input.close();
    }
}
