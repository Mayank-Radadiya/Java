// ✅ Shallow Copy vs. Deep Copy Demonstration in Java

class Publisher {
    String name;

    Publisher(String name) {
        this.name = name;
    }
}

class Book {
    String title;
    double price;
    Publisher publisher;

    // Parameterized constructor
    Book(String title, double price, Publisher publisher) {
        this.title = title;
        this.price = price;
        this.publisher = publisher;
    }

    // 🔁 Shallow Copy Constructor
    Book(Book other) {
        this.title = other.title;
        this.price = other.price;
        this.publisher = other.publisher; // ⚠ Shared reference
    }

    // ✅ Deep Copy Constructor
    Book(Book other, boolean deepCopy) {
        this.title = other.title;
        this.price = other.price;
        if (deepCopy) {
            this.publisher = new Publisher(other.publisher.name); // New object
        } else {
            this.publisher = other.publisher;
        }
    }

    void display(String label) {
        System.out.println(label + " → Title: " + title + ", Price: Rs." + price + ", Publisher: " + publisher.name);
    }
}

public class ShallowDeepCopy {
    public static void main(String[] args) {
        Publisher p = new Publisher("TechBooks");
        Book original = new Book("Java Mastery", 799.0, p);

        Book shallow = new Book(original); // Shallow copy
        Book deep = new Book(original, true); // Deep copy

        System.out.println("Before modifying publisher:");
        original.display("Original");
        shallow.display("Shallow Copy");
        deep.display("Deep Copy");

        // Modify publisher via shallow copy
        shallow.publisher.name = "CodePress";

        System.out.println("\nAfter modifying shallow copy's publisher:");
        original.display("Original"); // ⚠ Affected by shallow copy
        shallow.display("Shallow Copy");
        deep.display("Deep Copy"); // ✅ Unaffected
    }
}

