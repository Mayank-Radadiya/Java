// Inheritance.java
// --------------------------------------------
// ✅ Demonstrates types of Inheritance in Java
// Inheritance lets one class (child) acquire properties of another (parent)

// 📌 Single Inheritance Example
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// 📌 Multilevel Inheritance
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps");
    }
}

// 📌 Hierarchical Inheritance
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

// 📌 Interface-based Multiple Inheritance
interface Flyer {
    void fly();
}

interface Swimmer {
    void swim();
}

class Duck implements Flyer, Swimmer {
    public void fly() {
        System.out.println("Duck flies");
    }

    public void swim() {
        System.out.println("Duck swims");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        System.out.println("--- Single Inheritance ---");
        Dog d = new Dog();
        d.sound();
        d.bark();

        System.out.println("\n--- Multilevel Inheritance ---");
        Puppy p = new Puppy();
        p.sound();
        p.bark();
        p.weep();

        System.out.println("\n--- Hierarchical Inheritance ---");
        Cat c = new Cat();
        c.sound();
        c.meow();

        System.out.println("\n--- Multiple Inheritance using Interface ---");
        Duck duck = new Duck();
        duck.fly();
        duck.swim();
    }
}

/*
📘 Summary Table:
| Type                  | Example Classes          | Notes                                |
|-----------------------|--------------------------|--------------------------------------|
| Single Inheritance    | Dog → Animal             | One child extends one parent         |
| Multilevel Inheritance| Puppy → Dog → Animal     | Chain of inheritance                 |
| Hierarchical          | Dog, Cat → Animal        | Multiple children of same parent     |
| Multiple (via Interface)| Duck → Flyer, Swimmer  | Java supports via interfaces only    |
*/