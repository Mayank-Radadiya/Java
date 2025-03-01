import java.util.*;

// print
// ****
// ***
// **
// *
public class Que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines:");
        int line = sc.nextInt();

        for (int i = line; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
