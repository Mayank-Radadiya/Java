import java.util.*;

public class Que4 {
    public static void main(String[] args) {
        char b = 'A';
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of rows: ");
        int line = sc.nextInt();

        for (int i = 0; i < line; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(b);
                b++;
            }
            System.out.println();
        }
        sc.close();
    }
}
