package main.dayfive;

import java.util.Scanner;


public class IfElseTask {
    public static void main(String[] args) {

        // Create a scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Introduction to the task
        System.out.println("Welcome to the Animal Habitat Game!");
        System.out.println("You get to choose an animal, and I will tell you where it should live!");

        // Ask the user for their favorite animal
        System.out.print("\nEnter your favorite animal (e.g., lion, fish, bird): ");
        String animal = scanner.nextLine().toLowerCase();  // Get the animal and convert it to lowercase

        // Use conditional statements to decide the best habitat
        if (animal.equals("lion")) {
            System.out.println("The lion loves the savannah! It's a warm and grassy place.");
        }

        //Add 5 more animal types

        // Close the scanner
        scanner.close();
    }
}
