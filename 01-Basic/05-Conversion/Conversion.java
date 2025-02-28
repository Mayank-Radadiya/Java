public class Conversion {
    // Can't change number to string or number to boolean
    public static void main(String args[]) {
        int a = 10;
        long b = a;
        // destination type > source type
        // b's type > a's type
        System.out.println(b);

        int x = 10;
        float y = x;
        System.out.println(y); // 10.0

        // byte > short > int > float > long > double

    }
}