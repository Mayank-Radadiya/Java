// ConstructorChaining.java
// ----------------------------------------------------------
// ✅ Detailed explanation and example of Constructor Chaining in Java

/*
📘 What is Constructor Chaining?
────────────────────────────────────────────
Constructor chaining is the process of calling one constructor from another constructor
in the same class (using `this()`) or from the parent class (using `super()`).
It helps reuse initialization code and reduces redundancy.

🔹 Two types:
• Within same class → use `this()`
• From subclass to superclass → use `super()`
*/

/*
📊 this() vs super():
───────────────────────────────────────────────────────
| Keyword    | Calls constructor from...                |
|------------|-------------------------------------------|
| this()     | Same class                               |
| super()    | Parent (super) class                     |
| When used? | First line in a constructor              |
*/

class Vehicle {
    Vehicle() {
        System.out.println("Vehicle constructor called");
    }

    Vehicle(String type) {
        System.out.println("Vehicle type: " + type);
    }
}

class Car extends Vehicle {
    Car() {
        this("Sedan"); // Calls parameterized constructor in same class
        System.out.println("Default Car constructor");
    }

    Car(String model) {
        super("Four-wheeler"); // Calls superclass constructor
        System.out.println("Car model: " + model);
    }
}

public class Chaining {
    public static void main(String[] args) {
        Car car1 = new Car();
    }
}

/*
 * ✅ Summary:
 * ────────────────────────────────────────────
 * • Constructor chaining improves code reuse
 * • `this()` is used for same-class chaining
 * • `super()` is used to call superclass constructor
 * • Must be the first line inside constructor
 */
