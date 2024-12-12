package main.dayeight;

import java.util.Scanner;

public class LoopTask {
    //Fun Task: Make a "Guess the Favorite Color" Game!
    //Let’s create a "Guess the Favorite Color" game where the computer asks the user to guess your favorite color.
    // You will use the Scanner class to get input from the player and check if they guessed correctly! 🎨
    //
    //Task Steps:
    //Ask the player to guess your favorite color.
    //Use a for-each loop to check if their guess matches any color in your list of favorite colors.
    //If the guess is correct, print a congratulatory message. If not, give them a hint and let them try again!
    //Bonus: You can add more colors to the list and allow the player to keep guessing!


    public class GuessFavoriteColor {
        public static void main(String[] args) {
            // Create an array of your favorite colors
            String[] favoriteColors = {}; //TODO list colors here

            // Create a scanner object to get input from the user
            Scanner scanner = new Scanner(System.in);

            // Ask the user to guess your favorite color
            //TODO print text for user

            // Get the player's guess
            //TODO assign value to read response as String

            // Use a for-each loop to check if the guess is correct
            //TODO create boolean variable that flags if the guess is correct

            //TODO loop through the favoriteColors array
            //You will need to create for loop here that will pick each String color from the favoriteColors array //String color : favoriteColors
            //TODO check if the color is equal to the guess //use equalsIgnoreCase method
            //TODO if the color is equal to the guess, set the isCorrect variable to true and break the loop

            // Print the result
            //TODO check if the guess is correct
            //TODO print congratulatory message if the guess is correct
            //TODO print a hint and let the user try again if the guess is incorrect

            // Close the scanner to prevent resource leak
            scanner.close();
        }
    }



}
