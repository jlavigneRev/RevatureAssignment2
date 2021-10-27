package com.jameslavigne;

import java.util.Scanner;

/**
 * @author James Lavigne
 * Revature Assignment 2 : Q3
 */
class Average{
    public static double getAverage(double a, double b, double c){
        return ((a + b + c)/ 3);
    }
}

public class AverageCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double a = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        double b = scanner.nextDouble();
        System.out.println("Enter the third number: ");
        double c = scanner.nextDouble();


        //use method from class Average to get the average of numbers
        System.out.println("The average is: " + Average.getAverage(a,b,c));
    }

}
