package main.dayeight;


import java.util.Scanner;

public class NestedLoop {

    public static void main(String[] args) {

        // Example: Nested Loops - Multiplication Table for Numbers 1 to 3
        System.out.println("Example: Nested Loops - Multiplication Table for Numbers 1 to 3");
        for (int i = 1; i <= 3; i++) {
            System.out.println("\nMultiplication Table for " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }

        // Example: Boxed Multiplication Table (1-10)
        // TODO make it 1-5, make the spacing | between each number

        System.out.println("\nExample: Boxed Multiplication Table (1-10)");

        // Print the top header row with numbers 1 to 10
        System.out.print("     | "); // Print leading space and separator for alignment
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%4d ", i); // Print the column headers (numbers 1 to 10)
        }
        System.out.println(); // Move to the next line

        // Print the horizontal separator line under the header
        System.out.println("-----+" + "----".repeat(10));

        // Loop through each row (1 to 10)
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%4d | ", i); // Print the row header (current multiplier) with separator
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d ", i * j); // Print the product of i and j
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}