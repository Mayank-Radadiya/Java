import java.util.*;

public class BinaryToDecimal {

    public static void binaryToDecimal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number:");

        long num = sc.nextLong(); // Read binary input as a long
        int decimal = 0, power = 0;

        while (num > 0) {
            int lastDigit = (int) (num % 10); // Get the last digit
            decimal += lastDigit * Math.pow(2, power); // Convert to decimal
            num /= 10; // Remove last digit
            power++;
        }

        System.out.println("Decimal equivalent: " + decimal);
        sc.close();
    }

    public static void decimalToBinary() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number:");

        int num = sc.nextInt(); // Read decimal number
        int pow = 0;
        int binary = 0; // Store binary result

        while (num > 0) {
            int remainder = num % 2; // Get remainder (0 or 1)
            binary += (remainder * (int) Math.pow(10, pow));
            pow++;
            num /= 2; // Divide number by 2
        }

        System.out.println("Binary equivalent: " + binary);
        sc.close();
    }

    public static void main(String[] args) {
        // binaryToDecimal();
        decimalToBinary();
    }
}
