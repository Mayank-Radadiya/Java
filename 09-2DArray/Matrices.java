import java.util.Arrays;

public class Matrices {

    public static void search(int arr[][], int num) {
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == num) {
                    System.out.println("Found at " + i + "," + j);
                    return;
                }
            }
        }
    }

    public static void LargestAndSmallest(int arr[][]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int n = arr.length;
        int m = arr[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }

        System.out.println("Max num is " + max + " and min is " + min);
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 1, 2, 5 },
                { 1, 2, 3 }
        };

        // System.out.println(Arrays.deepToString(arr));
        // search(arr, 5);
        LargestAndSmallest(arr);
    }

}

