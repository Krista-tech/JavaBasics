package main.march_2;


/**
 * Some toys stay inside your backpack (Block Scope).
 * Some toys can be used anywhere in your room (Method Scope).
 * Some toys belong to only you but stay in your house (Instance Scope).
 * Some toys are shared by the whole family (Static Scope).
 * <p>
 * <p>
 * <p>
 * Scope	                Where does it exist?	                            Example (House Analogy)
 * Block Scope	        Inside {} of an if, for, or while loop	            A toy in your backpack (used only during a trip)
 * Method Scope	        Inside the entire method	                        A toy in your room (you can use it as long as you're there)
 * Instance Scope	    Inside the object (class level, but non-static)	    A pet in your house (only belongs to your house)
 * Static Scope	        Belongs to the whole class (shared across objects)	The family car (everyone shares it)
 */


/**
 * Description of the example code
 *
 * 1️⃣ Block Scope (bonusDamage in specialAttack())
 * Exists only inside the {} of the if statement.
 * If we try to use it outside, the code won’t work.
 * It’s like a snack inside a backpack—only available on a trip. 🎒
 *
 * 2️⃣ Method Scope (damage in attack())
 * Exists only inside the attack() method.
 * Once the method finishes, damage disappears.
 * It’s like a toy in your room—you can use it only when you're there. 🚪
 *
 * 3️⃣ Instance Scope (name)
 * Each character has its own name.
 * If we create a hero and villain, they each have different names.
 * It’s like each person has their own pet. 🐶
 *
 * 4️⃣ Static Scope (totalCharacters)
 * Shared by all characters.
 * Counts how many characters exist.
 * It’s like a family car—everyone shares it. 🚗
 */