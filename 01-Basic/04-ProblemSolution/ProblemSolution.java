import java.util.*;

public class ProblemSolution {

    public static void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();

        System.out.println("Enter Second number");
        int b = sc.nextInt();

        int c = a + b;

        System.out.println("Total " + c);
        sc.close();
    }

    public static void circleArea() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a redis of circle:");
        float r = sc.nextFloat();
        float area = 3.14f * r * r; 

        System.out.println("Area of circle " + area);
        sc.close();
    }

    public static void main(String[] args) {
        // sum();
        circleArea();
    }
}
