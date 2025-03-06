package main.march;

public class SimpleJavaMethod {

    /**
     * A method is like a recipe or a magic spell that tells the computer what to do.
     * Instead of writing the same instructions over and over,
     * we create a method once and use it whenever we need.
     **/

    //An example
    public class Greeting {
        // This method prints a message
        public static void sayHello() {
            System.out.println("Hello, Java!");
        }

        public static void main(String[] args) {
            // Calling the method
            sayHello();  // It prints: Hello, Java!
        }
    }

    /**
     * sayHello() is the method.
     * When we call it (use it), it prints a message.
     * We can call it many times without rewriting the code.
     */
}
