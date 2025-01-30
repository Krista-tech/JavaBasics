package main.jan2025;

public class BreakAndContinueLesson {
    public static void main(String[] args) {
        System.out.println("Lesson: Java Break and Continue");
        System.out.println("\nThe 'break' statement stops the loop when a certain condition is met.");
        System.out.println("Example: Let's stop when we reach 4.\n");

        // Example of break statement
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break; // Stop when i is 4
            }
            System.out.println(i);
        }

        System.out.println("\nThe 'continue' statement skips one loop cycle when a condition is met.");
        System.out.println("Example: Let's skip 4.\n");

        // Example of continue statement
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue; // Skip when i is 4
            }
            System.out.println(i);
        }

        System.out.println("\nTask: Try changing the number in the break and continue statements to see what happens!");
    }
}