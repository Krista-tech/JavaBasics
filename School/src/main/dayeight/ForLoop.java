package main.dayeight;

import java.util.Scanner;

public class ForLoop {
    // Key Learning Points
    // 1. A for loop is used to repeat a block of code a specific number of times.
    // 2. Syntax of a for loop:
    //    for (initialization; condition; update) {
    //        // Code block to execute
    //    }
    // 3. Initialization: Sets a starting value.
    // 4. Condition: Specifies when the loop should stop.
    // 5. Update: Changes the value after each iteration.

    public static void main(String[] args) {
        // Example 1: Printing numbers 0 to 4
        System.out.println("Example 1: Printing numbers from 0 to 4");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // Example 2: Printing even numbers between 0 and 10
        System.out.println("\nExample 2: Printing even numbers from 0 to 10");
        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i);
        }

        // Task: Multiplication table
        System.out.println("\nTask: Write a program that prints the multiplication table of a number of your choice.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to generate its multiplication table: ");
        int number = scanner.nextInt();

        System.out.println("\nMultiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        scanner.close();
    }
}