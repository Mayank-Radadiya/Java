// StringBuilder is a mutable class used to create and modify strings efficiently (unlike String, which is immutable).

public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        // Append
        sb.append(" World");
        System.out.println("After append: " + sb); // Hello World

        // Insert
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb); // Hello Java World

        // Replace
        sb.replace(6, 10, "Awesome");
        System.out.println("After replace: " + sb); // Hello Awesome World

        // Delete
        sb.delete(5, 13);
        System.out.println("After delete: " + sb); // Hello World

        // Reverse
        sb.reverse();
        System.out.println("After reverse: " + sb); // dlroW olleH

        // Length
        System.out.println("Length: " + sb.length());
    }
}
