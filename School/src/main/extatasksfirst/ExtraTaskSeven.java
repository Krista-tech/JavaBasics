package main.extatasksfirst;

import java.util.Scanner;

public class ExtraTaskSeven {
    /**
     * Create a program where the user can choose different types of operations to perform, such as basic arithmetic,
     * temperature conversions, or string manipulations.
     * The program will use a switch statement to navigate between these options and
     * nested switch cases for more specific operations.
     * <p>
     * Program Description
     * The user is shown a menu with options (e.g., Arithmetic, Temperature Conversion, String Operations, or Exit).
     * Based on the user's choice, another menu is displayed with sub-options.
     * Perform the operation based on user input and display the result.
     * Allow the user to continue until they choose to exit.
     */


    public static void main(String[] args) {
        // Create a Scanner object to read user input
        // Boolean variable to control the main program loop

        // Start of the main program loop
        // Display the main menu options to the user
        // Prompt user to choose an option

        // Check if the input is a valid integer
        // Display error for invalid input
        // Clear invalid input
        // Restart the loop

        // Read the user's choice

        // Main menu switch statement to handle the selected option
        // Call helper method for arithmetic operations
        // Call helper method for temperature conversion
        // Call helper method for string manipulations
        // Inform the user about exiting
        // Set the running variable to false to end the loop
        // Handle invalid menu choices

        // Close the Scanner object to free system resources
    }

    // Helper method for arithmetic operations
    public static void handleArithmetic(Scanner scanner) {
        // Display arithmetic menu options
        // Prompt user to choose an arithmetic operation

        // Validate user input for arithmetic choice
        // Display error for invalid input
        // Clear invalid input
        // Exit the method

        // Read the user's choice of arithmetic operation

        // Prompt user to enter the first number
        // Get valid input for the first number

        // Prompt user to enter the second number
        // Get valid input for the second number

        // Switch statement to perform the selected arithmetic operation
        // Perform addition and display the result
        // Perform subtraction and display the result
        // Perform multiplication and display the result
        // Check if the divisor is not zero
        // Perform division and display the result
        // Display error message for division by zero
        // Handle invalid arithmetic choice
    }

    // Helper method for temperature conversion
    public static void handleTemperatureConversion(Scanner scanner) {
        // Display temperature conversion menu options
        // Prompt user to choose a conversion type

        // Validate user input for temperature choice
        // Display error for invalid input
        // Clear invalid input
        // Exit the method

        // Read the user's choice of temperature conversion

        // Prompt user to enter the temperature
        // Get valid input for the temperature

        // Switch statement to perform the selected temperature conversion
        // Convert Celsius to Fahrenheit and display the result
        // Convert Fahrenheit to Celsius and display the result
        // Handle invalid temperature choice
    }

//    // Helper method for validating and reading a double input
//    public static double getValidDouble(Scanner scanner) {
//        // Loop until a valid double is entered
//        // Display error message
//        // Clear invalid input
//        // Return the valid double input
//    }

    // Helper method for string manipulations
    public static void handleStringManipulation(Scanner scanner) {
        // Display string manipulation menu options
        // Prompt user to choose a string operation

        // Validate user input for string choice
        // Display error for invalid input
        // Clear invalid input
        // Exit the method

        // Read the user's choice of string operation
        // Consume the newline character from the input buffer

        // Prompt user to enter a string
        // Read the string input

        // Switch statement to perform the selected string manipulation
        // Reverse the string and display it
        // Convert the string to uppercase and display it
        // Find and display the string length
        // Handle invalid string choice
    }
}
