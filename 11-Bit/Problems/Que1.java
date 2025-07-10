public class Que1 {
    // Find given num is even or odd.
    public static void main(String[] args) {
        int num = 7;

        // Bitwise AND with 1 checks the last bit of the number
        // If last bit is 1 => number is odd
        // If last bit is 0 => number is even
        if ((num & 1) == 0) {
            // If result is 0, number is even
            System.out.println(num + " is Even");
        } else {
            // If result is 1, number is odd
            System.out.println(num + " is Odd");
        }
    }
}
