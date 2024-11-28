package main.dayseven;

import java.util.Scanner;

public class WhileLoopTask {
    public static void main(String[] args) {

        /**
         * Collecting Stars
         *
         * Objective:
         * Create a program where the user collects stars until they have 10 stars.
         * The program will use a while loop to track and display progress.
         */

        //Task Requirements:
        //
        //Start with 0 stars.
        //Each time the user inputs a number of stars collected (e.g., 1, 2, 3), add it to the total.
        //Use a while loop to continue asking for input until the total number of stars reaches 10 or more.
        //Display messages to show the number of stars collected after each input.
        //When the user reaches 10 stars, display a congratulatory message and exit the loop.

        //Output example:
        //You need 10 stars to win!
        //How many stars did you collect? 2
        //You now have 2 stars.
        //How many stars did you collect? 4
        //You now have 6 stars.
        //How many stars did you collect? 5
        //You now have 11 stars.
        //Congratulations! You collected 10 stars!

        Scanner scanner = new Scanner(System.in);
        int totalStars = 0;

        //TODO
        // write the information for user with System.out.println
        //Create while loop that says while stars are less than 10, keep asking for input
        //ask user how many stars they collected, remember its number
        //you do see in line 35, we do have total star number
        //we do need to add the number of stars user collected to totalStars ( Arithmetics in day five could help on how to do addition)
        // write if else logic (day six tasks might help) in case stars are less than 10, print the total number of stars
        //in case more, print the total number of stars and congratulatory message


        scanner.close();

    }
}
