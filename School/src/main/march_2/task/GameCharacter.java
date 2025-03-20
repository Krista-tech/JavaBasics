package main.march_2.task;

public class GameCharacter {

    // TASK 1: Create an instance variable `name` (Each character has a name)
    // TASK 2: Create an instance variable `health` (Each character has health)
    // TASK 3: Create a static variable `totalCharacters` (Counts how many characters exist)

    // TASK 4: Create a constructor that sets `name` and `health`, and increases `totalCharacters`

    // TASK 5: Create an `attack()` method (No parameters)
    // It should print: "Character attacks and deals 10 damage!"

    // TASK 6: Overload `attack(String weapon)`
    // It should print: "Character attacks with [weapon] and deals 15 damage!"

    // TASK 7: Overload `attack(String weapon, int damage)`
    // It should print: "Character attacks with [weapon] dealing [damage] damage!"
    // Inside this method, add a block-scoped variable:
    // If `damage > 20`, create `criticalHit = 5` inside an `if` block and print "Critical Hit! Extra 5 damage added!"

    // TASK 8: Create a `defend()` method (No parameters)
    // It should print: "Character raises a shield and blocks 5 damage!"
    // Inside this method, add a block-scoped variable:
    // If `health < 30`, create `extraDefense = 5` inside an `if` block and print "Character is weak! Gains an extra defense boost of 5!"

    // TASK 9: Create a `displayCharacterInfo()` method (No parameters)
    // It should print:
    // "Character Name: [name]"
    // "Health: [health]"
}