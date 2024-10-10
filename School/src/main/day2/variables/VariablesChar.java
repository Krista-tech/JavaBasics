package main.day2.variables;

public class VariablesChar {
    public static void main(String[] args) {


        /**
         *  char
         *  stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
         */

        /** Creating and Assigning a char */
        float myNumber = 3.14f;
        System.out.println(myNumber);  // Output: 3.14


        /** Storing Special Characters
         * You can store special characters like newline (\n),
         * tab (\t), or escape characters (\\, \')
         * using escape sequences.
         */
        char newLine = '\n';  // Newline character
        char tab = '\t';  // Tab character

        System.out.println("Line1" + newLine + "Line2");  // Output on two lines
        System.out.println("Column1" + tab + "Column2");  // Output with a tab space

        /**
         * Changing Case of Characters
         * The Character.toUpperCase()
         * and Character.toLowerCase() methods allow you to
         * convert a character to uppercase or lowercase.
         */

        char lowercase = 'b';
        char uppercase = Character.toUpperCase(lowercase);

        System.out.println(uppercase);  // Output: B

        /**
         * Concatenating Characters to Form a String
         * You can concatenate multiple characters to form a String.
         * To do this, you can use the + operator to combine the characters.
         */
        char char1 = 'H';
        char char2 = 'e';
        char char3 = 'l';
        char char4 = 'l';
        char char5 = 'o';

        // Concatenate the characters to form a String
        String word = "" + char1 + char2 + char3 + char4 + char5;

        System.out.println(word);  // Output: Hello
    }
}