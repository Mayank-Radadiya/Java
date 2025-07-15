// RecursionConcept.java

/*
📘 What is Recursion?
────────────────────────────────────────────
Recursion is a programming technique where a method calls itself to solve a problem 
by breaking it down into smaller sub-problems. It continues until it reaches a base case.

🔹 Java Recursion Characteristics:
• Requires a base case to terminate the recursive calls
• Divides problem into smaller instances of the same problem
• Uses the call stack to track function calls
• May lead to StackOverflowError if not handled correctly
*/

/*
📊 Types of Recursion:
───────────────────────────────────────────────────────
| Type               | Description                                      |
|--------------------|--------------------------------------------------|
| Direct Recursion   | Method calls itself directly                     |
| Indirect Recursion | Method A calls B and B calls A                   |
| Tail Recursion     | Recursive call is the last operation             |
| Head Recursion     | Recursive call happens before any other logic   |
| Tree Recursion     | Method makes multiple recursive calls            |
*/

// Example of Recursion
class RecursionExamples {

    // Factorial using head recursion (n!)
    public int factorial(int n) {
        if (n <= 1)
            return 1; // base case
        return n * factorial(n - 1); // recursive call
    }

    // Fibonacci using tree recursion
    public int fibonacci(int n) {
        if (n <= 1)
            return n; // base case
        return fibonacci(n - 1) + fibonacci(n - 2); // recursive calls
    }

    // Print numbers from n to 1 using head recursion
    public void printDescending(int n) {
        if (n < 1)
            return; // base case
        System.out.print(n + " ");
        printDescending(n - 1); // recursive call
    }

    // Print numbers from 1 to n using tail recursion
    public void printAscending(int n) {
        if (n < 1)
            return; // base case
        printAscending(n - 1); // recursive call
        System.out.print(n + " ");
    }
}

// Main class to test recursion examples
public class Basic {
    public static void main(String[] args) {
        RecursionExamples rec = new RecursionExamples();

        System.out.println("Factorial of 5: " + rec.factorial(5)); // Output: 120

        System.out.println("Fibonacci of 6: " + rec.fibonacci(6)); // Output: 8

        System.out.print("Descending from 5: ");
        rec.printDescending(5); // Output: 5 4 3 2 1
        System.out.println();

        System.out.print("Ascending to 5: ");
        rec.printAscending(5); // Output: 1 2 3 4 5
        System.out.println();
    }
}

/*
 * ✅ Summary:
 * ────────────────────────────────────────────
 * • Recursion solves problems by calling the same method within itself
 * • A base case is essential to prevent infinite calls
 * • Useful for problems like factorial, Fibonacci, tree/graph traversals
 * • Can be less efficient than iteration if not optimized
 */
