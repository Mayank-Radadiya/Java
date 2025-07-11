// CopyConstruction.java
// ----------------------------------------------
// Demonstrates how to implement a copy constructor
// in Java and why it is useful.

class Book {
    String title;
    double price;

    // Parameterized constructor
    Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    // 🔄 Copy constructor
    Book(Book other) {
        this.title = other.title;
        this.price = other.price;
    }

    void display(String label) {
        System.out.println(label + " → Title: " + title + ", Price: Rs." + price);
    }
}

class CopyConstruction {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", 499.0); // Original book
        Book b2 = new Book(b1); // Copy constructor used

        System.out.println("Before price update:");
        b1.display("Original");
        b2.display("Copy");

        // Modify the copied object
        b2.price = 599.0;

        System.out.println("\nAfter price update in copy:");
        b1.display("Original");
        b2.display("Copy");

    }
}
