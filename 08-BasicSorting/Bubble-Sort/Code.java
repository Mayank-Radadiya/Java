import java.util.Arrays;

public class Code {

    public static void sort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            int swap = 0; // make count if swap value not increase that means array is already sorted.
            for (int j = 0; j < arr.length - 1 - i; j++) { // Fixed the range here
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                swap++;
            }

            if (swap == 0) {
                System.out.println("Array is already sorted");
                break;
            }

        }

        System.err.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 7, 4, 5 };
        sort(arr);
    }
}
