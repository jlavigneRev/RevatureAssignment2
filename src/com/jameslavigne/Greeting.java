package com.jameslavigne;

import java.util.Scanner;

/**
 * @author James Lavigne
 * Revature Assignment 2 : Q2
 */
public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name = scanner.nextLine();

        System.out.println("Enter the roll number:");
        int roll = 0;
        try {
            roll = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        
        System.out.println("Enter the field of interest:");
        String field = scanner.nextLine();

        //print in given format
        System.out.println("Hey, my name is " + name + " and my roll number is " + roll + ". My field of interest are " + field + ".");
    }
}
