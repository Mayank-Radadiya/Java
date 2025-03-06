import java.util.Arrays;

// swap first and last number and so on...
// 
public class Reverse {
    public static void reverseArray(int arr[]) {
        int first = 0;
        int last = arr.length - 1;

        while (first < last) {
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

        reverseArray(arr);
        System.out.println(Arrays.toString(arr));

    }
}
