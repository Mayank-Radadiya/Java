// InterfaceConcept.java
// ----------------------------------------------------------
// ✅ Detailed explanation and example of Interface in Java

/*
📘 What is an Interface?
────────────────────────────────────────────
An interface in Java is a reference type that defines a contract (method declarations) that implementing classes must follow.
It supports abstraction and enables multiple inheritance in Java.

🔹 Java Interface Characteristics:
• All methods are implicitly public and abstract (until Java 7)
• From Java 8: can have default and static methods
• From Java 9: can have private methods
• All variables are public static final by default
• Cannot be instantiated
*/

/*
📊 Class vs Interface:
───────────────────────────────────────────────────────
| Feature              | Interface                             |
|                      | Class                                 |
|----------------------|----------------------------------------|
| Inheritance Type     | Supports multiple inheritance          |
|                      | Single inheritance only                |
| Method Types         | Abstract, default, static, private     |
|                      | Concrete & abstract methods            |
| Variables            | public static final only               |
|                      | All types of variables allowed         |
| Constructor          | Not allowed                            |
|                      | Allowed                                |
| Access Modifier      | All methods are public by default      |
|                      | As declared                            |
*/

// Example of Interface
interface Animal {
    void sound(); // abstract method
}

interface Pet {
    void play(); // another interface
}

// A class implementing multiple interfaces
class Dog implements Animal, Pet {
    public void sound() {
        System.out.println("Dog barks");
    }

    public void play() {
        System.out.println("Dog plays fetch");
    }
}

// Main class to test interface implementation
public class InterfaceConcept {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound(); // Output: Dog barks
        d.play(); // Output: Dog plays fetch
    }
}

/*
 * ✅ Summary:
 * ────────────────────────────────────────────
 * • Interface defines a set of rules for classes
 * • Helps achieve full abstraction
 * • Enables multiple inheritance in Java
 * • Cannot have constructors or instance variables
 */
