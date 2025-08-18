import java.util.Arrays;

public class ArrayQue {

    public static void storeItem(int[] arr, int n) {
        if (n == arr.length) {
            return;
        }
        int x = n;
        arr[x] = x + 1;
        storeItem(arr, n + 1);
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        storeItem(arr, 0);
        System.out.println(Arrays.toString(arr));
    }
}