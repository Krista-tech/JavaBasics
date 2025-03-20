package main.march_2.example;


public class GameCharacter {
    // Instance variable (belongs to each character)
    private String name;

    // Static variable (shared by all characters)
    public static int totalCharacters = 0;

    // Constructor (sets instance variable)
    public GameCharacter(String characterName) {
        this.name = characterName;
        totalCharacters++; // Shared by all characters
    }

    // Method Scope: `damage` is local to this method
    public void attack() {
        int damage = 10; // Method scope (only exists inside attack())
        System.out.println(name + " attacks and deals " + damage + " damage!");
    }

    // Block Scope: `bonusDamage` only exists inside the if-statement
    public void specialAttack() {
        int baseDamage = 20; // Method scope (available inside specialAttack())

        if (baseDamage > 15) {
            int bonusDamage = 5; // Block scope (only exists inside if block)
            System.out.println(name + " performs a special attack with " + (baseDamage + bonusDamage) + " damage!");
        }

        // System.out.println(bonusDamage); ❌ ERROR! bonusDamage doesn't exist outside the if block.
    }
}
