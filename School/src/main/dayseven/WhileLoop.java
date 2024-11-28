package main.dayseven;

public class WhileLoop {
    public static void main(String[] args) {
        /**
         * What is a While Loop?
         *
         * A while loop is used to repeat a block of code as long as a specific condition is true. It's like saying:
         *
         * "Keep doing this action until something changes."
         *
         * ------------------------------------------------------------------------------
         * Why Use While Loops?
         *
         * Repetition Made Easy: Instead of writing the same code multiple times,
         * you can use a while loop to repeat it automatically.
         * Interactive Programs: While loops are great for programs where the number of repetitions isn't known
         * in advance (e.g., user keeps entering data until they type "exit").
         * Efficiency: Helps avoid redundant code and makes your program easier to update or modify.
         *
         * ------------------------------------------------------------------------------
         * How Does a While Loop Work?
         * The while loop has three main parts:
         *
         * Initialization: A variable is set up to control the loop.
         * Condition: The loop checks if a condition is true before running the code block.
         * Update: After each loop, the variable is updated to avoid infinite loops.
         * ------------------------------------------------------------------------------
         */

        boolean conditions = true;

        while (conditions) {
            // Code block to be executed as long as the condition is true
        }

        /**
         * How It Works:
         * The program checks the condition.
         * If the condition is true, the code block inside the loop runs.
         * After the code runs, it goes back to check the condition again.
         * If the condition is false, the loop stops.
         */


        //Simple Example: Counting
        int i = 0; // Step 1: Initialize
        while (i < 5) { // Step 2: Check the condition
            System.out.println(i); // Step 3: Execute the code
            i++; // Step 4: Update the variable
        }

        //Explanation:
        //
        //The loop starts with i = 0.
        //It checks if i < 5. Since 0 < 5 is true, the code inside the loop runs.
        //After printing the number, i++ increases the value of i by 1.
        //The loop stops when i is no longer less than 5.

        /**
         * Key Points to Remember:
         * Be Careful with Conditions: If you forget to update the variable inside the loop,
         * the condition may never become false, leading to an infinite loop.
         * Loops Can Control Flow: While loops allow you to repeat tasks until the job is done.
         * Interactive Input: They are often used with user input,
         * where you can't predict how many times the loop will run.
         */


    }
}
