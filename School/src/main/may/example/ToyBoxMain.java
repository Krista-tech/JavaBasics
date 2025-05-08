package main.may.example;

import java.util.Scanner;

/**
 * This class shows how to use the ToyBoxLogic class.
 */
public class ToyBoxMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToyBoxLogic myBox = new ToyBoxLogic();

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        myBox.setOwner(name);

        System.out.print("How many toys do you want to add? ");
        int toys = scanner.nextInt();
        myBox.addToys(toys);

        System.out.println(myBox.getOwner() + ", your toy box has " + myBox.checkToys() + " toys!");
    }
}
