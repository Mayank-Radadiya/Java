import java.util.*;

/*
 * 0
 * 10
 * 101
 * 0101
 */

public class Que4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows:");
        int rows = sc.nextInt();
        boolean OneOrZero = true;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                if (OneOrZero == true) {
                    System.out.print("1 ");
                    OneOrZero = false;
                } else {
                    System.out.print("0 ");
                    OneOrZero = true;
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
