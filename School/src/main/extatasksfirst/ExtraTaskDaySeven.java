package main.extatasksfirst;

public class ExtraTaskDaySeven {
    public static void main(String[] args) {

        /**
         * Task: Treasure Hunt with Health Points
         *
         * Objective:
         * Create a program that simulates a treasure hunt game using a do/while loop.
         * The player starts with a certain number of health points (HP)
         * and explores different locations to find treasures or encounter traps.
         *
         * The game continues until the player either collects a set amount of treasure
         * or their health points drop to zero.
         */


        //Task Requirements:
        //
        //The player starts with 100 HP and 0 treasures.
        //Use a do/while loop to simulate the player's journey:
        //Each iteration, the player chooses an action: explore a new location or quit.
        //If the player explores, randomly decide:
        //Gain treasures (+10 to +50).
        //Encounter traps (-10 to -30 HP).
        //Find a health potion (+10 to +20 HP, but not above 100 HP).
        //The loop ends when:
        //The player collects 200 or more treasures (win condition).
        //The player's HP drops to 0 or below (loss condition).
        //Use Math.random() to generate random events.
        //Display messages showing the player's HP and treasure count after each action.
        //At the end of the game, display a message indicating if the player won or lost.

        //Output example:
        //Welcome to the Treasure Hunt Game!
        //You have 100 HP and 0 treasures.
        //
        //What would you like to do? (1 = Explore, 2 = Quit): 1
        //You explored and found a trap! You lost 20 HP.
        //Current HP: 80, Treasures: 0
        //
        //What would you like to do? (1 = Explore, 2 = Quit): 1
        //You explored and found a treasure chest! You gained 40 treasures.
        //Current HP: 80, Treasures: 40
        //
        //What would you like to do? (1 = Explore, 2 = Quit): 1
        //You explored and found a health potion! You gained 15 HP.
        //Current HP: 95, Treasures: 40
        //
        //What would you like to do? (1 = Explore, 2 = Quit): 1
        //You explored and found a trap! You lost 30 HP.
        //Current HP: 65, Treasures: 40
        //
        //What would you like to do? (1 = Explore, 2 = Quit): 2
        //You quit the game. Final HP: 65, Treasures: 40. Thanks for playing!


        //EXTRA info about what you will need:
        //Scanner:
        //
        //Used for taking input from the user.
        //In this game, it reads the player’s action (1 = Explore, 2 = Quit).
        //Important: Always close the scanner after use to prevent resource leaks.
        //Variables:
        //
        //healthPoints: Tracks the player's health (starting at 100).
        //treasures: Tracks the player's treasure count (starting at 0).
        //choice: Stores the player's decision for each turn (to explore or quit).
        //do/while Loop:
        //
        //Ensures the game continues to prompt the player until:
        //The player collects 200 treasures (win condition), or
        //The player's health drops to 0 or below (loss condition).
        //The loop runs at least once, regardless of starting conditions.
        //Random Events with Math.random():
        //
        //Generates a random number between 0 and 1.
        //Multiplied and cast into integers to create randomized outcomes for:
        //Treasure found (+10 to +50).
        //Trap damage (-10 to -30 HP).
        //Health potion healing (+10 to +20 HP).
        //Switch Statement:
        //
        //Simplifies event handling by categorizing outcomes into:
        //Case 0: Trap (negative effect).
        //Case 1: Treasure (positive effect).
        //Case 2: Health Potion (restorative effect).
        //If-Else Logic:
        //
        //Determines if the game ends due to:
        //Health dropping to 0 (healthPoints <= 0).
        //Collecting enough treasures (treasures >= 200).
        //System.out.println:
        //
        //Used extensively for:
        //Displaying game instructions.
        //Showing the result of the player's actions.
        //Providing updates on the player's health and treasure status.
        //Indicating the game outcome.
        //Closing the Scanner:
        //
        //Prevents resource leaks after the user finishes interacting with the program.
    }
}
