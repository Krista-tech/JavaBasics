package main.day2.variables;

public class VariablesString {
    public static void main(String[] args) {


        /**
         * String
         * In programming, a string is a sequence of characters used to represent text.
         * It can include letters, numbers, symbols, and spaces,
         * and is typically enclosed in quotation marks.
         */

        /** Creating and Assigning a String Variable */
        String name = "Liene";
        System.out.println(name);

        /** You can combine (concatenate) two or more strings using the + operator.*/
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        /** You can use the .length() method to find the number of characters in a string. */
        String message = "Hello!";
        int length = message.length();
        System.out.println(length);  // Output: 6

        /** Converting a String to Upper or Lower Case
         * You can convert the letters in a string to uppercase using .toUpperCase()
         * or lowercase using .toLowerCase()
         */
        String text = "Hello, World!";
        String upperCase = text.toUpperCase();
        String lowerCase = text.toLowerCase();
        System.out.println(upperCase);  // Output: HELLO, WORLD!
        System.out.println(lowerCase);  // Output: hello, world!

        /** You can extract a portion of a string using the .substring() method. */
        String text2 = "Hello, World!";
        String subString = text2.substring(7);
        System.out.println(subString);  // Output: World!

    }
}