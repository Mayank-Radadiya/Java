
public class Overloading {

    public static void multiplication(int a, int b) {
        System.out.println("Output : " + a * b);
    }

    public static void multiplication(double a, double b) {
        System.out.println("Output : " + a * b);
    }

    public static void multiplication(int a, int b, int c) {
        System.out.println("Output : " + a * b * c);
    }

    public static void main(String[] args) {
        // Multiple function with same name but different parameters.
        multiplication(2, 4);
        multiplication(1.5, 2.9);
        multiplication(2, 20, 3);
        // you don't have to remember for different function for different datatype
        // arguments.
    }
}
