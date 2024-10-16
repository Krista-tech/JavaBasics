package main.daythree;

public class Integer {
    public static void main(String[] args) {


        /**
         * Integer
         * It is a wrapper class that comes from java.lang.Integer.
         * It allows an int to act like an object,
         * which means it can be used in places where objects are required (like collections).
         * It can be null, representing no value.
         * It has methods for converting, comparing, and manipulating numbers.
         */

        java.lang.Integer myNumber = 10;
        System.out.println(myNumber);

        /**
         * You can also declare an Integer without assigning a value to it.
         * In this case, the value will be null.
         */
        java.lang.Integer myNumber2;
        myNumber2 = null;
        System.out.println(myNumber2);

        /**
         * parseInt
         * This method is used to get the primitive data type of a String.
         * It throws NumberFormatException if the string cannot be parsed as an integer.
         */
        String numberStr = "100";
        java.lang.Integer myNumber3 = java.lang.Integer.parseInt(numberStr);

        System.out.println(myNumber3);
        System.out.println("as String:" + numberStr);

        /**
         * The value 0 if this Integer is equal to the compared Integer;
         * a value less than 0 if this Integer is numerically less than the compared Integer;
         * a value greater than 0 if this Integer is numerically greater than the compared Integer;
         */
        System.out.println(myNumber3.compareTo(19));
    }
}