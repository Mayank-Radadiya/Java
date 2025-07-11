// AbstractClass.java
// --------------------------------------------------
// ✅ Demonstrates Abstract Classes in Java
// Abstract classes define common structure but cannot be instantiated directly

abstract class Shape {
    abstract double area(); // abstract method (no body)

    void displayType() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(4, 6);

        s1.displayType();
        System.out.println("Circle area: " + s1.area());

        s2.displayType();
        System.out.println("Rectangle area: " + s2.area());
    }
}

/*
 * 📘 Key Points:
 * ──────────────────────────────────────────
 * • Abstract class can have abstract and non-abstract methods
 * • Cannot create object of abstract class directly
 * • Subclasses must implement all abstract methods
 * • Useful for base templates or partial implementations
 */
