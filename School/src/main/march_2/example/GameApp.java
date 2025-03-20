package main.march_2.example;



public class GameApp {
    public static void main(String[] args) {
        // Creating characters (Instance Scope)
        GameCharacter hero = new GameCharacter("Knight");
        GameCharacter villain = new GameCharacter("Dark Wizard");

        // Calling attack methods (Method Scope)
        hero.attack();
        villain.attack();

        // Calling special attack (Method & Block Scope in action)
        hero.specialAttack();
        villain.specialAttack();

        // Accessing static variable (Static Scope)
        System.out.println("Total characters created: " + GameCharacter.totalCharacters);
    }
}