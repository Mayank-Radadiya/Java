import java.util.*;

public class Solution {

    public static boolean prime(int num) {
        if (num == 2) {
            return true;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    // print all prime number to given range.
    // 2 to n.
    public static void primeRange(int num) {
        for (int i = 2; i <= num; i++) {
            if (prime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();

        // prime number.
        // System.out.println(prime(num));

        primeRange(num);

        sc.close();
    }
}
