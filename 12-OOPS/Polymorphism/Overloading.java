
// Overloading.java
// -------------------------------------------
// Overloading = multiple methods/Function with same name but different parameters

class Calculator {
    // Add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Add two doubles
    double add(double a, double b) {
        return a + b;
    }

    // Add string numbers
    String add(String a, String b) {
        return a + b;
    }
}

public class Overloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("add(int, int): " + calc.add(10, 20));
        System.out.println("add(int, int, int): " + calc.add(10, 20, 30));
        System.out.println("add(double, double): " + calc.add(5.5, 6.5));
        System.out.println("add(String, String): " + calc.add("Hello", " World"));
    }
}

/*
 * 📘 Key Points:
 * ─────────────────────────────
 * • Method name is same: `add`
 * • Parameter list must differ (count/type/order)
 * • Return type can differ, but it’s not enough on its own to overload
 */