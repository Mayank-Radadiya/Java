import java.util.*;

public class If_Else {

    public static void main(String[] args) {
        // get user age and check it is more then 18 or not.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Your age is more then 18.");
        } else {
            System.out.println("Your age is less then 18.");
        }

        sc.close();

    }
}