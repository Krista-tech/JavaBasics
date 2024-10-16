package main.daythree;

public class VariablesFloat {
    public static void main(String[] args) {


        /**
         * float
         * stores floating point numbers, with decimals, such as 19.99 or -19.99
         */

        /** Creating and Assigning a float */
        float myNumber = 3.14f;
        System.out.println(myNumber);  // Output: 3.14


        /** You can perform basic arithmetic operations like addition,
         * subtraction, multiplication, and division with float values.
         */
        float num1 = 5.5f;
        float num2 = 2.2f;

        float sum = num1 + num2;  // Addition
        float difference = num1 - num2;  // Subtraction

        System.out.println("Sum: " + sum);  // Output: Sum: 7.7
        System.out.println("Difference: " + difference);  // Output: Difference: 3.3


        /** You can compare two float values using relational operators like ==, !=, >, <, etc. */
        float num3 = 3.14f;
        float num4 = 3.14f;
        float num5 = 2.71f;

        boolean isEqual = num3 == num4;  // true
        boolean isNotEqual = num3 != num5;  // true
        boolean isGreater = num3 > num5;  // true

        System.out.println("Equal: " + isEqual);  // Output: Equal: true
        System.out.println("Not Equal: " + isNotEqual);  // Output: Not Equal: true
        System.out.println("Greater: " + isGreater);  // Output: Greater: true

    }
}