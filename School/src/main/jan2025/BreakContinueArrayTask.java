package main.jan2025;

public class BreakContinueArrayTask {
    public static void main(String[] args) {
        /**
         * Task 1: Using Arrays, Break, and Continue
         *
         * Imagine you are playing a game where you collect different candies.
         * You have a list of candies with different sweetness levels.
         * Your task is to:
         * 1. Print all candies except those with a sweetness level below 5 (use continue).
         * 2. Stop collecting candies if you find one with a sweetness level of 10 (use break).
         */

        int[] candies = {7, 3, 6, 8, 5, 2, 10, 9, 4};

        System.out.println("Candy Collection:");

        for (int candy : candies) {
            if (candy < 5) {
                continue; // Skip candies with sweetness below 5
            }

            System.out.println("Candy with sweetness level: " + candy);

            if (candy == 10) {
                System.out.println("Wow! You found the sweetest candy! Game over!");
                break; // Stop collecting when the sweetest candy is found
            }
        }

        /**
         * Task 2: Balloon Popping Game
         *
         * You are playing a game where you pop balloons of different sizes.
         * Your task is to:
         * 1. Print all balloons except those smaller than size 3 (use continue).
         * 2. Stop popping balloons if you find one of size 10 (use break).
         */

        int[] balloons = {2, 5, 7, 1, 4, 10, 6, 3};

        System.out.println("\nBalloon Popping Game:");

        for (int balloon : balloons) {
            if (balloon < 3) {
                continue; // Skip small balloons
            }

            System.out.println("Popped balloon of size: " + balloon);

            if (balloon == 10) {
                System.out.println("You found the biggest balloon! Game over!");
                break; // Stop popping when the biggest balloon is found
            }
        }

        /**
         * Extra Challenge: Modify the program to ask for user input to fill the arrays.
         */
    }
}
