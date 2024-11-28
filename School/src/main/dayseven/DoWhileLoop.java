package main.dayseven;

public class DoWhileLoop {
    public static void main(String[] args) {

        /**
         * What is a Do/While Loop?
         * The do/while loop is another type of loop in Java.
         *
         * It works similarly to the while loop, but with one key difference:
         *
         * A do/while loop always runs at least once, regardless of whether the condition is true or false.
         * This is because the condition is checked after the loop has executed, not before.
         * ------------------------------------------------------------------------------
         *
         * Why Use a Do/While Loop?
         * Guaranteed Execution:
         * If you need a block of code to run at least once before checking the condition.
         *
         * Interactive Programs:
         * Commonly used when the program must perform an action and then check if it should repeat,
         * such as processing user input or playing games.
         *
         * ------------------------------------------------------------------------------
         * How Does a Do/While Loop Work?
         * A do/while loop has two main parts:
         *
         * Code Block:
         * The actions to perform (executed at least once).
         *
         * Condition:
         * Checked after the code block is executed. If true, the loop runs again
         *
         */

        boolean condition = true;
        do {
            // Code block to execute
        } while (condition);

        /**
         * How It Works:
         * The do block runs first, executing the code inside it.
         * After the code runs, the while condition is checked.
         * If the condition is true, the loop repeats. If false, the loop ends.
         */

        int i = 0; // Initialize the variable

        do {
            System.out.println(i); // Print the value of i
            i++; // Increment the variable
        } while (i < 5); // Check if i is still less than 5//Simple Example: Counting

        //Explanation:
        //
        //The do block prints the value of i and increments it by 1.
        //After each iteration, the condition i < 5 is checked.
        //The loop stops when i is no longer less than 5.

        /**
                                 Key Differences Between While and Do/While Loops
        ---------------------------------------------------------------------------------------------------------------
                      While Loop	                      |              Do/While Loop
        ----------------------------------------------------------------------------------------------------------------
        The condition is checked before the code runs.	 | The code runs before the condition is checked.
        ----------------------------------------------------------------------------------------------------------------
        May not execute at all if the condition is false.| Always executes at least once, even if the condition is false.
        ----------------------------------------------------------------------------------------------------------------
         */


        //When Should You Use It?
        //Do/While Loop: When the action must be performed at least once before deciding if it should repeat.
        //Example: Asking a user for input at least once, like a menu prompt.
        //While Loop: When you need to check the condition first, before performing any action.



    }
}
