import java.util.*;

public class Solution {

    // find odd or even.
    public static void OddEven() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
        sc.close();
    }

    // Income tax calculator.
    public static void IncomeTax() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Income:");
        int income = sc.nextInt();

        if (income <= 500000) {
            System.out.println("your tax is o%");
        } else if (income > 500000 && income <= 1000000) {
            float tax = (income * 20) / 100;
            System.out.println("You have to pay 20% of your income " + tax);
        } else if (income > 1000000) {
            float tax = (income * 30) / 100;
            System.out.println("You have to pay 30% of your income " + tax);
        } else {
            System.out.println("Invalid  input.");
        }
        sc.close();
    }

    // Print largest number.Take 3 different number as input.
    public static void largest() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number for comparison:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println("largest number is " + a);
        } else if (b > c) {
            System.out.println("largest number is " + b);
        } else {
            System.out.println("largest number is " + c);
        }
        sc.close();
    }

    // Calculator
    public static void Calculator() {
        Scanner sc = new Scanner(System.in);
        System.out.println("two number for calculation: ");
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter Operator");
        char operator = sc.next().charAt(0);
        System.out.println("Enter b");
        int b = sc.nextInt();

        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;

            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;

            case '/':
                System.out.println(a / b);
                break;
            default:
                break;
        }
        sc.close();

    }

    public static void leapYear() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int year = sc.nextInt();

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Leap year");
        } else {
            System.out.println("not Leap year");
        }
        sc.close();
    }

    public static void main(String[] args) {
        // OddEven();
        // IncomeTax();
        // largest();
        // Calculator();
        // leapYear();
    }
}
