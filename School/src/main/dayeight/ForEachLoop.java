package main.dayeight;

public class ForEachLoop {


    //or-Each Loop: Theory and Simple Examples for Kids
    //A for-each loop is a special type of loop that makes it easier to go through each item in an array (a list of items) one by one. It’s like going through a box of toys and looking at each toy one by one.
    //
    //In normal loops, you usually work with an index (like 0, 1, 2, etc.) to access the items, but with a for-each loop, you don’t need to worry about the index. It just picks each item for you automatically, and you can do something with it.
    //
    //Syntax of For-Each Loop
    //Here is the format for a for-each loop in Java:
    //
    //java
    //Copy code
    //for (type variableName : arrayName) {
    //  // code block to be executed
    //}
    //type is the type of the items in the array (for example, String for words).
    //variableName is the name of the temporary variable that will hold each item as the loop goes through the array.
    //arrayName is the name of the array (like a list of things you want to look at).
    //Example 1: Printing a List of Cars
    //Let’s say we have an array of cars, and we want to print each car's name one by one. Instead of using an index to go through the list, we can use a for-each loop:
    //

    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String car : cars) {
            System.out.println(car);
        }
    }


    //What Happens in This Example:
    //
    //We have a list (array) of car names: "Volvo", "BMW", "Ford", and "Mazda".
    //The for-each loop goes through each car in the list one by one, and System.out.println(car); prints the name of each car.
    //Output:
    //
    //Copy code
    //Volvo
    //BMW
    //Ford
    //Mazda
}
