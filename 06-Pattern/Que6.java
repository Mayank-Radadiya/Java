import java.util.Scanner;

//     *****
//    *****
//   *****
//  *****
// *****
public class Que6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows:");
        int rows = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            // blank space
            for (int j = rows - 1; j > i; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= rows; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
