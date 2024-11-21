package main.daysix;

public class IfElse {


    public static void main(String[] args) {

        // Explanation of basic conditions
        System.out.println("Java Conditionals Examples:");

        // Example: Checking if 20 is greater than 18
        System.out.println("\nExample 1: Checking if 20 is greater than 18");
        if (20 > 18) {
            System.out.println("20 is greater than 18");
        }

        // Example: Using variables to check conditions
        int x = 20;
        int y = 18;
        System.out.println("\nExample 2: Using variables to check if x is greater than y");
        if (x > y) {
            System.out.println("x is greater than y");
        }

        // Example with else if and else
        int number = 15;
        System.out.println("\nExample 3: Using if, else if, and else with a number variable");
        if (number > 20) {
            System.out.println("The number is bigger than 20");
        } else if (number > 10) {
            System.out.println("The number is bigger than 10 but not bigger than 20");
        } else {
            System.out.println("The number is 10 or less");
        }

        // Final Task: Temperature Check
        System.out.println("\nFinal Task: Temperature Check\n");

        // Temperature variable for the task
        int temperature = 25;  // You can change this number to test different temperatures

        // Temperature check with if, else if, and else
        if (temperature > 30) {
            System.out.println("It's a hot day!");
        } else if (temperature >= 15) {
            System.out.println("It's a warm day.");
        } else {
            System.out.println("It's a cold day!");
        }

        // Example of Switch Case
        System.out.println("\nExample 4: Switch Case to Identify a Day of the Week");

        // Day variable for switch case
        int day = 3;  // Change this value to test different days (1-7)

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}


