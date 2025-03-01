import java.util.*;

public class Solution {

    public static void patten1() {
        /*
         * Example for 4x4 input:
         * ****
         * ****
         * ****
         * ****
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of row and column:");

        int row = sc.nextInt();
        int column = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                System.out.print("*"); // Print '*' without moving to a new line
            }
            System.out.println(); // Move to a new line after printing a full row
        }

        sc.close();
    }

    public static void reverse() {
        // revers given number
        // Solution: num % 10 => give last number.
        // num / 10 => remove last number.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int number = sc.nextInt();

        while (number > 0) {
            System.out.print(number % 10);
            number = (int) number / 10;
        }

        sc.close();

    }

    public static void reverse2() {
        // revers given number
        // store revers number and print.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int number = sc.nextInt();

        int reverseNum = 0;

        while (number > 0) {
            int lastNum = number % 10;
            reverseNum = (reverseNum * 10) + lastNum;
            number = (int) number / 10;
        }

        System.out.println(reverseNum);

        sc.close();

    }

    public static void multipleOf10() {
        System.out.println("Enter value till it's multiple of 10.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        while (true) {
            int num = sc.nextInt();
            if (num % 10 == 0)
                break;
            System.out.println("Enter Number again:");
        }

        System.out.println("oops...you entered multiple of 10");
        sc.close();

    }

    public static void prime() {
        // 2,3,5,7,11,13,17,19....

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");

        int num = sc.nextInt();
        boolean isPrime = true;

        if (num == 2) {
            System.out.println(num + " is prime");
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) { // n is multiple of any of i.
                    isPrime = false;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is prime");
        } else {
            System.out.println(num + " is not prime");
        }
        sc.close();
    }

    public static void factorial() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
        int n = 1;

        for (int i = 1; i <= num; i++) {
            n *= (i);
        }

        System.out.println(n);
        sc.close();

    }

    public static void main(String[] args) {
        // patten1();
        // reverse();
        // reverse2();
        // multipleOf10();
        // prime();
        // factorial();
    }
}
