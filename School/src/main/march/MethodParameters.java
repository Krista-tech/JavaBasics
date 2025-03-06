package main.march;

public class MethodParameters {

    /**
     * Sometimes, we need to pass information to a method to make it do something specific.
     * This is where parameters come in!
     *
     * Think of it like a recipe that needs ingredients, that you do not know yet.
     **/

    //An example
    public class Greeting {
        // This method takes a name as a parameter
        public static void sayHello(String name) {
            System.out.println("Hello, " + name + "!");
        }

        public static void main(String[] args) {
            // Calling the method with different names
            sayHello("Alice"); // Prints: Hello, Alice!
            sayHello("Bob");   // Prints: Hello, Bob!
        }
    }

    /**
     * sayHello(String name) → The method takes a name as an ingredient.
     * When we call it, we pass a name, and it greets that person.
     * We don’t need to write separate methods for Alice and Bob—one method does it all.
     */
}
