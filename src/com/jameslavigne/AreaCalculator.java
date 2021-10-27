package com.jameslavigne;

import java.util.Scanner;

/**
 * @author James Lavigne
 * Revature Assignment 2 : Q1
 */
public class AreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        double length = scanner.nextDouble();
        System.out.println("Enter the breadth of the rectangle:");
        double breadth = scanner.nextDouble();

        //calculate area of rectangle (cast to int)
        int area = (int)(length * breadth);
        System.out.println("The area of the rectangle as an integer is: " + area);
    }

}
