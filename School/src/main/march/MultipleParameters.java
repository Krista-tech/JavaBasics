package main.march;

public class MultipleParameters {

    /**
     * Just like a recipe can have more than one ingredient, a method can have multiple parameters.
     **/

    //An example
    public class Greeting {
        // This method takes a name as a parameter
        public static void sayHello(String name, String surname) {
            System.out.println("Hello, " + name + surname + "!");
        }

        public static void main(String[] args) {
            // Calling the method with different names
            sayHello("Alice", "Timely"); // Prints: Hello, Alice Timely!
            sayHello("Bob", "Builder");   // Prints: Hello, Bob Builder!
        }
    }

    //It can be used in bit more complex way as well

    public class Calculator {
        // This method adds two numbers
        public static int add(int a, int b) {
            return a + b;
        }

        public static void main(String[] args) {
            int sum = add(5, 3);  // 5 + 3 = 8
            System.out.println("The sum is: " + sum);
        }
    }

    /**
     * add(int a, int b) → This method takes two numbers.
     * return a + b; → It returns the sum.
     * Instead of writing 5 + 3 ourselves, the method does it for us!
     */
}
