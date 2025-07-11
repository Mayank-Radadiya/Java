// Constructor.java
// ------------------------------
// ✅ What is a constructor?
//? A **constructor** is a special method used to initialize objects when they are created using `new`.
// It has the same name as the class and has **no return type**.

/*
| Type              | Description                            |
|-------------------|-----------------------------------------|
| Default           | Auto-created if no constructor is       |
|                   | defined                                 |
| No-arg constructor| Manually created, takes no parameters   |
|                   | Example: `new Student();`               |
| Parameterized     | Takes parameters to set initial state   |
|                   | Example: `new Student("Xyz", 21);`  |
| Constructor Overload | Multiple constructors with different |
|                   | parameter lists                         |
*/

public class Constructor {
    public static void main(String[] args) {
        // Using different constructor types
        Student s1 = new Student(); // No-arg constructor
        Student s2 = new Student("xyz", 21); // Parameterized constructor
        Student s3 = new Student("Raj"); // Overloaded constructor

        s1.display();
        s2.display();
        s3.display();
    }
}

class Student {
    String name;
    int age;

    // 1. No-arg constructor (manual)
    Student() {
        name = "Unknown";
        age = 0;
    }

    // 2. Parameterized constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    // 3. Overloaded constructor (different parameters)
    Student(String n) {
        name = n;
        age = 18; // default age
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

/*
 * 🔁 Summary:
 * ────────────
 * • Constructors run automatically when objects are created.
 * • You can overload them to handle different inputs.
 * • If you don’t write any constructor, Java adds a default one.
 */
