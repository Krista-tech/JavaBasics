package main.daythree;

public class VariablesBoolean {
    public static void main(String[] args) {


        /**
         *  boolean
         *  essential for creating logic and controlling the behavior of your programs.
         *  It enables programmers to make decisions and execute code based on conditions,
         *  which is a fundamental aspect of programming.
         */

        /** You can declare a boolean variable and assign it either true or false. */
        boolean isJavaFun = true;
        boolean isFishTasty = false;

        System.out.println("Is Java fun? " + isJavaFun);  // Output: Is Java fun? true
        System.out.println("Is fish tasty? " + isFishTasty);  // Output: Is fish tasty? false


        /** You can use logical expressions to evaluate conditions that result in a boolean value. */
        int a = 10;
        int b = 20;

        boolean result1 = (a < b);  // true, because 10 is less than 20
        boolean result2 = (a == b);  // false, because 10 is not equal to 20

        System.out.println("Is a less than b? " + result1);  // Output: true
        System.out.println("Is a equal to b? " + result2);  // Output: false

        /**
         * You can combine multiple boolean values using logical operators such as && (AND), || (OR), and ! (NOT).
         */

        boolean hasGoodGrades = true;
        boolean isActiveInSports = false;

        // AND operator
        boolean scholarshipEligible = hasGoodGrades && isActiveInSports;  // false
        System.out.println("Eligible for scholarship: " + scholarshipEligible);  // Output: false

        // OR operator
        boolean extraCurricularParticipation = hasGoodGrades || isActiveInSports;  // true
        System.out.println("Participating in extracurricular activities: " + extraCurricularParticipation);  // Output: true

        // NOT operator
        boolean isNotActiveInSports = !isActiveInSports;  // true
        System.out.println("Is not active in sports: " + isNotActiveInSports);  // Output: true


        /**
         * You can use boolean values in control structures like if statements to execute code conditionally.
         */
        boolean isRaining = true;

        if (isRaining) {
            System.out.println("Take an umbrella.");  // Output: Take an umbrella.
        } else {
            System.out.println("No need for an umbrella.");
        }

        /**
         * You can control loop execution based on a boolean condition.
         */
        boolean isPlaying = true;
        int score = 0;

        while (isPlaying) {
            // Simulate scoring
            score += 10;
            System.out.println("Current Score: " + score);  // Output: Current Score: 10, 20, 30...

            // End the game after reaching a score of 50
            if (score >= 50) {
                isPlaying = false;  // Stop playing
            }
        }

        System.out.println("Game Over! Final Score: " + score);  // Output: Game Over! Final Score: 50
    }
}