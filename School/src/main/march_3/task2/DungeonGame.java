package main.march_3.task2;


/**
 * 🏰 DungeonGame
 *
 * This class simulates a knight exploring a dungeon.
 * It includes methods for exploring rooms, encountering monsters, finding treasures,
 * and resting in rooms.
 */
public class DungeonGame {

    public static void main(String[] args) {

        System.out.println("🔰 Starting dungeon exploration...\n");

        // Basic adventure
        exploreDungeon("Knight", 1, 10);

        System.out.println("\n🏆 Starting treasure hunt mode...\n");

        // Treasure tracking version
        exploreWithLoot("Dragon Hunter", 1, 12, 0);
    }
}
