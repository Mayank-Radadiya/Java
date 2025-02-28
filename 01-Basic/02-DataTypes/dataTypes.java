/*
 * two types of data types
 * 1. Primitive data types
 * 2. Non-primitive data types
 * 
 * 
 * Primitive data types
     byte, short, int, long, float, double, char, boolean
        
*   Non-primitive data types
*   String, Array, Class, object, Interface
 */

public class dataTypes {

    public static void main(String args[]) {
        // Primitive data types
        byte a = 10;
        short b = 20;
        int c = 30;
        long d = 40;
        float e = 50.5f;
        double f = 60.6;
        char g = 'A';
        boolean h = true;

        System.out.println("byte: " + a);
        System.out.println("short: " + b);
        System.out.println("int: " + c);
        System.out.println("long: " + d);
        System.out.println("float: " + e);
        System.out.println("double: " + f);
        System.out.println("char: " + g);
        System.out.println("boolean: " + h);

        // Non-primitive data types
        String i = "Hello World";
        System.out.println("String: " + i);

        int j[] = { 1, 2, 3, 4, 5 };
        System.out.println("Array: " + j[0]);

        dataTypes k = new dataTypes();
        System.out.println("Class: " + k);

        // Object
        Object l = new Object();
        System.out.println("Object: " + l);

        // Interface
        Runnable m = new Runnable() {
            @Override
            public void run() {
                System.out.println("Interface");
            }
        };
        m.run();
    }

}
