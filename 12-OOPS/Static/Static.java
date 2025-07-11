// StaticConcept.java
// ----------------------------------------------------------
// ✅ Detailed explanation and example of static keyword in Java

/*
📘 What is `static` in Java?
────────────────────────────────────────────
The `static` keyword in Java is used for memory management.
It can be applied to variables, methods, blocks, and nested classes.
Static members belong to the **class** instead of instances (objects).

🔹 Static Members:
• Shared among all instances
• Accessible without creating an object
• Useful for constants, utility methods, counters, etc.
*/

class Counter {
    static int count = 0; // static variable
    int id; // instance variable

    Counter() {
        count++; // shared across all objects
        id = count; // unique per object
    }

    void show() {
        System.out.println("Object ID: " + id + ", Shared Count: " + count);
    }

    static void printMessage() { // static method
        System.out.println("This is a static method.");
    }
}

public class StaticConcept {
    public static void main(String[] args) {
        Counter.printMessage(); // called without object

        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        c1.show();
        c2.show();
        c3.show();
    }
}

/*
 * ✅ Summary:
 * ────────────────────────────────────────────
 * • `static` is used for class-level members
 * • Saves memory and avoids duplication
 * • Static methods cannot access non-static fields directly
 */