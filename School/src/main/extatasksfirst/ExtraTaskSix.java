package main.extatasksfirst;

import java.util.Scanner;


public class ExtraTaskSix {
    /**
     * Story:
     * This task will calculate the student's grade based on their score and provide helpful feedback.
     */

    //Requirements:

    //Variables:
    //Use a variable totalCost to keep track of the total cost of the items in the cart.
    //Use a variable shopping to control the shopping loop (true or false).
    //Use a variable discount to store any discount applied based on the total cost.
    //Use a variable finalTotal to store the final price after discounts and shipping.
    //Use a variable shippingCost to calculate shipping costs based on the user's total.

    //Loops:
    //Create a while loop that allows the user to continue adding items to their cart until they choose to stop or checkout.
    //The loop should display the available items after each item is added and ask the user if they want to continue shopping.

    //Switch Statement:
    //Use a switch statement to handle the user's choice of items. Each case should correspond to a specific item
    // (e.g., T-shirt, Jeans, Hat, Shoes), adding the respective price to the totalCost.

    //Conditional Statements (if-else):
    //After the user finishes shopping, check if the totalCost qualifies for a discount:
    //If the totalCost is greater than or equal to $100, apply a 10% discount.
    //Check if the user qualifies for free shipping:
    //If the finalTotal (after applying discounts) is greater than or equal to $50, provide free shipping; otherwise, charge $5 for shipping.

    //User Interaction:
    //Display a list of items available for purchase (e.g., T-shirt - $15, Jeans - $30, etc.).
    //Prompt the user to enter the number corresponding to the item they want to add to their cart.
    //After each item is added, ask if the user wants to continue shopping or proceed to checkout.

    //Output:
    //Display the totalCost after the user selects their items.
    //If a discount applies, show the discount amount and the new finalTotal.
    //Show the shipping cost and the final total after shipping is added.
    //Display a thank you message once the user completes the shopping process.

    public static void main(String[] args) {


        // Create a scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Introduction
        System.out.println("Welcome to the Online Store!");
        System.out.println("Here you can add items to your shopping cart and calculate the total cost.");

        // Variables to keep track of the shopping cart
        double totalCost = 0;
        boolean shopping = true;

        // Start the shopping loop
        while (shopping) {
            // Display the available items
            //Available Items
            //1. T-shirt - $15
            //2. Jeans - $30
            //3. Hat - $10
            // 4. Shoes - $50
            //5. Exit and checkout

            // Ask the user to choose an item


            // Switch to handle the choice //default when not provided in any cases
//            switch () {
//                case 1:
//                    //System.out.println("You added a T-shirt ($15) to your cart.");
//                    //totalCost += 15;
//                    break;



            // Check if user wants to continue shopping
            if (shopping) {
               //Would you like to add another item? (yes/no)


                //if continue == no ->  shopping = false; -> You're checking out no

            }
        }

        // After exiting the loop, show the total cost
        System.out.println("\nYour total is: $" + totalCost);

        // Apply a discount if applicable
        double discount = 0;

           //10% discount if total is $100 or more


        // Calculate the final total after discount
        double finalTotal = totalCost - discount;
        System.out.println("Your total after discount (if any) is: $" + finalTotal);

        // Check if the user qualifies for free shipping
        // Default shipping cost
        // Free shipping if total is $50 or more


        // Final total including shipping

        //"Your final total including shipping is

        // Thank the user
        //Thank you for shopping with us! Have a great day!

        // Close the scanner
        scanner.close();
    }
}