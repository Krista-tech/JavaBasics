package main.may.example;

/**
 * This class shows how encapsulation works
 */
public class ToyBoxLogic {

    // Private field - others can't change this directly!
    private int toyCount;
    private String owner;

    // Set the owner of the toy box
    public void setOwner(String name) {
        owner = name;
    }

    // Get the name of the toy box owner
    public String getOwner() {
        return owner;
    }

    // Add toys to the box (only positive numbers)
    public void addToys(int number) {
        if (number > 0) {
            toyCount += number;
            System.out.println(number + " toys added!");
        } else {
            System.out.println("You can't add a negative number of toys!");
        }
    }

    // Check how many toys are in the box
    public int checkToys() {
        return toyCount;
    }
}

