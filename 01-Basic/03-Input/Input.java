import java.util.*;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String name = sc.next();
        sc.nextLine(); // Consume the leftover newline

        System.out.println("Enter your full name: ");
        String fullName = sc.nextLine();

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("You are register true or false ");
        boolean booleanVal = sc.nextBoolean();

        System.out.println("My name is " + name);
        System.out.println("Full Name is " + fullName);
        System.out.println("Age is " + age);
        System.out.println("Is Register " + booleanVal);

        sc.close(); // Close the scanner to prevent resource leak
    }
}
