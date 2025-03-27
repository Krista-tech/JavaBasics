package main.march_3.task;


public class StairLogicTask {

    // TASK 1: Create a method `climb(String name, int current, int top)`
    // This method should print the current step, and stop when current > top
    // If the step is even, add a 🌟 to the print
    // Use recursion to go to the next step

    // TASK 2: Create an overloaded method `climb(String name, int current, int top, int stars)`
    // This version should also count how many stars (even steps) the character collects
    // When finished, print something like:
    // "Emma reached the top with 3 stars!"

    // TASK 3: Create a version that returns a message instead of printing directly
    // Example:
    // public static String climbWithMessage(String name, int current, int top)
    // Return the final message string once the climb is complete

    // TASK 4: Inside the recursive method, add indentation based on step number
    // (Each step should be indented with spaces, like a staircase)
    // You can multiply spaces by the current step number

    // TASK 5: BONUS — Add a method that lets the character rest every 3 steps
    // Print: "[name] takes a short rest on step 3 😌" if current % 3 == 0

    // TASK 6: BONUS — Add a method that returns the total number of steps climbed
    // Use recursion to count the steps and return the total at the end
}