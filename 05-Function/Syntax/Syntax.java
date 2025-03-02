// all function use
// =>  call by value......
// means if  i pass any argument in function.it will create a copy of original value.
// a = 5
// function(a) print a+10
// again if print it will be 5 
// changes will for function scope. not change in main memory.

public class Syntax {
    public static void helloworld() {
        System.out.println("Hello World!");
    }

    public static void sum(int a, int b) { // parameters
        System.out.println(a + b);
    }

    // swap two value.
    public static void swap(int a, int b) {
        int c = b;
        b = a;
        a = c;
        System.out.println("first value is " + a);
        System.out.println("second value is " + b);
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        helloworld();
        // different between parameters and arguments....
        sum(2, 4); // sum(argument1 , argument2)

        // swap(10, 20);

        // int result = multiplication(5, 20);
        // System.out.println(result);

        
    }
}
