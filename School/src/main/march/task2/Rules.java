package main.march.task2;

public class Rules {

    //In GameCharacter.java
    /**
     *  Attacking (Method Overloading)
     *
     *Create an attack() method with no parameters: -> Prints "The character throws a punch!".
     * Overload attack() with one parameter: attack(String weapon) → Prints "The character attacks with a [weapon]!".
     * Overload attack() with two parameters: attack(String weapon, int damage)
     * → Prints "The character attacks with a [weapon] dealing [damage] damage!".
     *
     *  Defending (Method Overloading)
     *
     *  Create a defend() method with no parameters: ->Prints "The character raises their hands to block!".
     *  Overload defend() with one parameter: -> defend(String shield) → Prints "The character defends using a [shield]!".
     *  Overload defend() with two parameters:
     *  -> defend(String shield, int blockPower) → Prints "The character defends using a [shield] with [blockPower] defense!".
     *
     *  Healing (Method Overloading)
     *  Create a heal() method with no parameters: -> Prints "The character rests and recovers some health!".
     *  Overload heal() with one parameter -> heal(int healthPoints)
     *  → Prints "The character drinks a potion and heals [healthPoints] HP!".
     *  Overload heal() with two parameters -> heal(int healthPoints, String item)
     *  → Prints "The character uses [item] and restores [healthPoints] HP!".
     *
     *
     **/

    //In GameApp.java
    /**
     * Inside GameApp, call each attack, defend, and heal method at least once to test overloading.
     * Make sure to call the methods using the class name (GameCharacter.attack(...)) etc..
     */

    //Example Expected Output
    /**
     * The character throws a punch!
     * The character attacks with a sword!
     * The character attacks with a fireball dealing 50 damage!
     * The character raises their hands to block!
     * The character defends using a wooden shield!
     * The character defends using an iron shield with 30 defense!
     * The character rests and recovers some health!
     * The character drinks a potion and heals 20 HP!
     * The character uses a magic crystal and restores 100 HP!
     */

    //Extra Challenge (Optional)
    /**
     * Give the character name and use it in the print statements.
     */

}
