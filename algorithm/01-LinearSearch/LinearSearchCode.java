public class LinearSearchCode {

    // find a value in given array.
    // Time Complexity is => O(n)

    public static void findValue() {
        int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int find = 10;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == find) {
                System.out.println(find + " is present at index " + i + " in this array");
                return;
            }

        }
        System.out.println(find + " is not present in this array");
    }

    public static void findString() {
        String arr1[] = { "Hello", "user1", "user2", "user3" };

        String find = "user2";

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == find) {
                System.out.println(find + " is present at index " + i + " in this array");
                return;
            }

        }
        System.out.println(find + " is not present in this array");
    }

    public static void main(String[] args) {
        findValue();
        findString();

    }
}
