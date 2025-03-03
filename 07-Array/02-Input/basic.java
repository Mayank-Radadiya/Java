import java.util.Scanner;
import java.util.Arrays;

public class basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks[] = new int[3];

        System.out.println("Enter your three subjects marks:");

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        marks[1] = marks[1] + 10;

        System.out.println("Marks: " + Arrays.toString(marks)); // Correct way to print an array
        int average = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("average " + average);

        // length
        System.out.println(marks.length);
        sc.close();
    }
}
