import java.util.*;

//    *
//   **
//  ***
// **** 
//*****
public class Que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter row");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            // Print spaces
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
