package main.march;

public class MethodOverloading {

    /**
     * Sometimes, we want to use the same method name but with different inputs.
     * This is called method overloading.
     *
     * Imagine a magic spell that works differently depending on how you say it.
     **/

    //An example
    public class OverloadingExample {
        // Method with one parameter
        public static void sayHello(String name) {
            System.out.println("Hello, " + name + "!");
        }

        // Overloaded method with two parameters
        public static void sayHello(String name, int age) {
            System.out.println("Hello, " + name + "! You are " + age + " years old.");
        }

        public static void main(String[] args) {
            sayHello("Emma");      // Calls the first method
            sayHello("Alex", 25);  // Calls the second method
        }
    }

    /**
     * The first method only takes a name (sayHello("Emma")).
     * The second method takes a name and an age (sayHello("Alex", 25)).
     * Java knows which method to use based on how many parameters we provide.
     */
}
