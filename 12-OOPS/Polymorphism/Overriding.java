// Overriding.java
// --------------------------------------------
// ✅ Demonstrates Method Overriding in Java
// Overriding = redefining a superclass method in a subclass

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Animal a;

        a = new Dog();
        a.sound(); // Dog's sound() is called

        a = new Cat();
        a.sound(); // Cat's sound() is called
    }
}

/*
📘 Key Points:
──────────────────────────────────────────
• Method name, return type, and parameters must be same
• Must override a superclass method
• Use `@Override` to help compiler catch errors
• Achieves Runtime Polymorphism
*/
