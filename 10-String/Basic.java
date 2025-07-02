import java.util.*;

public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take full string input from user
        // System.out.print("Enter a string: ");
        // String str = sc.nextLine();
        // System.out.println("You entered: " + str);

        // 1. Length of the string
        String name = "Hello";
        System.out.println("Length: " + name.length()); // Output: 5

        // 2. Concatenate (join) two strings
        String name1 = "Hello";
        String name2 = "World";
        String full = name1 + " " + name2;
        System.out.println("Concatenated: " + full); // Output: Hello World

        // 3. Character at a specific index
        System.out.println("Character at index 1: " + name.charAt(1)); // Output: e

        // 4. Compare strings (case-sensitive)
        System.out.println("name1 equals name2? " + name1.equals(name2)); // Output: false

        // 5. Compare ignoring case
        System.out.println("Equals Ignore Case: " + name1.equalsIgnoreCase("hello")); // true

        // 6. Convert to lowercase and uppercase
        System.out.println("Lowercase: " + name.toLowerCase()); // hello
        System.out.println("Uppercase: " + name.toUpperCase()); // HELLO

        // 7. Substring
        System.out.println("Substring (1 to 4): " + name.substring(1, 4)); // Output: ell

        // 8. Replace characters
        System.out.println("Replace l with x: " + name.replace('l', 'x')); // Hexxo

        // 9. StartsWith / EndsWith
        System.out.println("Starts with He? " + name.startsWith("He")); // true
        System.out.println("Ends with lo? " + name.endsWith("lo")); // true

        // 10. Index of a character
        System.out.println("Index of 'l': " + name.indexOf('l')); // Output: 2

        // 11. Compare a string

        String name3 = "apple";
        String name4 = "banana";

        System.out.println("Compare: " + name3.compareTo(name4)); // Output: negative (because 'a' < 'b')

        sc.close();
    }
}
