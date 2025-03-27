package main.march_3.example;


/**
 * 🚀 RocketLogic
 *
 * Recursively counts down from a number to 0 by a chosen step.
 * Adds some special effects based on number.
 */
public class RocketLogic {

    public static void countdown(int number, int step) {
        if (number <= 0) {
            System.out.println("🔥 Ignition!");
            System.out.println("🚀 Lift off!");
        } else {
            if (number % 2 == 0) {
                System.out.println(number + "... ✨ (even)");
            } else {
                System.out.println(number + "...");
            }
            countdown(number - step, step);
        }
    }
}