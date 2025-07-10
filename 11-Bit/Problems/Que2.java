// Get n-th bit from binary (from right, 0-based index)
public class Que2 {

    public static void Approach1() {
        int z = 50; // Decimal number
        int n = 1; // n-th bit from right (0 = LSB)

        // Convert to binary string
        String binary = Integer.toBinaryString(z); // 50 = 110010
        System.out.println("Binary: " + binary);

        // Access n-th bit from right (so count from end)
        // Index = length - 1 - n
        char x = binary.charAt(binary.length() - 1 - n);
        System.out.println("Bit at position " + n + " from right: " + x);
    }

    // Better approach.
    public static void Method2() {

        int z = 50; // 50 in binary = 110010
        int n = 1; // Get the 1st bit from right (0-based)

        // Shift right n times, then AND with 1 to get that bit
        int bit = (z >> n) & 1;

        System.out.println("Bit at position " + n + " from right: " + bit);

    }

    // set ith bit
    public static void setIthBit(int n, int i) {
        int bitmask = 1 << n;

        System.out.println(n | bitmask);
    }

    // clear nth bit
    public static void clearIthBit(int i, int n) {
        int bitmask = ~(1 << n);

        System.out.println(n & bitmask);
    }

    public static void main(String[] args) {

        Approach1();
        Method2();
        setIthBit();

    }
}
