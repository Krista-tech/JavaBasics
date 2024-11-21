package main.daysix;

public class Switch {
    public static void main(String[] args) {


//    How Does a Switch Statement Work?
//
//    The switch expression is evaluated once.
//    The value of the expression is compared to each case.
//    When a match is found, the code inside that case runs.
//    If no match is found, the default code block runs (optional).
//    Syntax
//    Here’s what a switch statement looks like:


//      Example:
//     switch (expression) {
//        case value1:
//            // Code to run if expression equals value1
//            break;
//        case value2:
//            // Code to run if expression equals value2
//            break;
//        default:
//            // Code to run if no cases match
//    }

        //Why Do We Use break?
        //The break keyword tells Java to stop checking other cases after finding a match.
        //If you don’t include break, the program will continue running the code in the next cases, even if they don’t match.


//Example: Days of the Week
//Let’s find out which day of the week it is based on a number!


            int day = 4; // Change this number to test other days!

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
                    System.out.println("Invalid day number! Please choose a number between 1 and 7.");
            }
        }

}