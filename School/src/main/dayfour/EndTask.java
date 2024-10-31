package main.dayfour;

import java.util.Scanner;


/** HalloweenCharacterProfile. */
public class EndTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /**
         * Halloween Character Profile
         *
         * Declare variables of various types.
         * Use Scanner to collect user input.
         * Print a character profile using the collected data.
         */



        // Get character details
        //Character name (String)
        System.out.print("Enter the name of your Halloween character: ");
        String characterName = scanner.nextLine();

        //Character age (int)

        //Character height (float)

        //A unique icon or symbol for the character (char) https://unicode.org/emoji/charts/full-emoji-list.html

        //Whether the character is friendly (boolean)

        //Ask the user for a special ability of the character (like flying, invisibility, etc.).

        //Add a question for the character's favorite Halloween candy (String).



        // Print the Halloween Character Profile
        System.out.println("\nHalloween Character Profile");
        System.out.println("---------------------------");
        System.out.println("Name: " + characterName);
        //Age: "
        //Height:
        //Icon:
        //Friendly:
        //Special Ability:
        //Favorite Candy:


        scanner.close();
    }
}