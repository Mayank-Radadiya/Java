public class BitOperator {

 /*
     === Bitwise Operators (Quick Reference) ===
     Symbol  Name       Example      Description
     --------------------------------------------
     &       AND        5 & 3 = 1    1 if both 1
     |       OR         5 | 3 = 7    1 if any 1
     ^       XOR        5 ^ 3 = 6    1 if diff
     ~       NOT        ~5 = -6      Inverts bits
     <<      LShift     5<<1 = 10    Shift left
     >>      RShift     5>>1 = 2     Shift right
     >>>     URShift    -8>>>1 = ?   Right fill 0
    */
    public static void main(String[] args) {

        //Convert integer number to binary.
        int intNum = 10;
        String binary = Integer.toBinaryString(intNum);
        System.out.println(binary); // 1010


        int a = 5; // 0101 in binary
        int b = 3; // 0011 in binary

        // 1. Bitwise AND (&)
        int andResult = a & b; // 0101 & 0011 = 0001 (1)
        System.out.println("a & b = " + andResult);

        // 2. Bitwise OR (|)
        int orResult = a | b; // 0101 | 0011 = 0111 (7)
        System.out.println("a | b = " + orResult);

        // 3. Bitwise XOR (^)
        int xorResult = a ^ b; // 0101 ^ 0011 = 0110 (6)
        System.out.println("a ^ b = " + xorResult);

        // 4. Bitwise Complement (~)
        int complementResult = ~a; // ~0101 = 1010 (in 32-bit: ~5 = -6)
        System.out.println("~a = " + complementResult);

        // 5. Left Shift (<<)
        int leftShift = a << 1; // 0101 << 1 = 1010 (10)
        // Formula : a << b = a * 2^b( this 2 power b not a or operator).
        System.out.println("a << 1 = " + leftShift);

        // 6. Right Shift (>>)
        int rightShift = a >> 1; // 0101 >> 1 = 0010 (2)
        // Formula: a << b = a / 2^b.
        System.out.println("a >> 1 = " + rightShift);

        // 7. Unsigned Right Shift (>>>)
        int num = -8; // In binary: 11111111 11111111 11111111 11111000
        int unsignedRightShift = num >>> 1;
        System.out.println("num >>> 1 = " + unsignedRightShift);
    }
}
