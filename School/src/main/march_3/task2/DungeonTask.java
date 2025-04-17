package main.march_3.task2;



public class DungeonTask {

    // TASK 1: Create a method `exploreDungeon(String name, int currentRoom, int totalRooms)`
    // This method will simulate a knight exploring rooms in a dungeon.

    // TASK 2: If currentRoom is greater than totalRooms,
    // Print: "[name] has reached the end of the dungeon. 🏁 Adventure complete!"
    // Then stop the method.

    // TASK 3: If currentRoom is a multiple of 3, print:
    // "[name] encounters a MONSTER in room [currentRoom]! 🐉 Fighting..."

    // TASK 4: If currentRoom is a multiple of 4, print:
    // "[name] finds a treasure in room [currentRoom]! 💰"

    // TASK 5: If currentRoom is a multiple of 5, print:
    // "[name] rests at room [currentRoom] 💤"

    // TASK 6: If the room is empty (doesn't match 3, 4, or 5), print:
    // "[name] walks through an empty room [currentRoom]..."

    // TASK 7: Add indentation based on currentRoom level, like a deepening dungeon
    // (Use "  ".repeat(currentRoom - 1) for indentation)

    // TASK 8: Recursively call the method with currentRoom + 1

    // TASK 9: Create a main method that starts the dungeon adventure
    // Example: exploreDungeon("Sir Lancelot", 1, 10);

    /**
     * EXTRA TASKS:
     * - Add a counter that tracks how many monsters were fought
     * - Add a second method exploreWithLoot(String name, int currentRoom, int totalRooms, int treasureCount)
     * - Print the total treasure collected when the adventure is complete
     */
}