public class DiagonalSum {

    public static void sum(int[][] arr) {
        int sum = 0;

        // Used to track opposite diagonal (secondary diagonal)
        int n = 0;
        int m = arr.length - 1;

        // Loop through the matrix
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                // Main diagonal condition: row index == column index
                if (i == j) {
                    sum += arr[i][j];
                }

                // Secondary diagonal condition: row + column = size - 1
                if (i + j == arr.length - 1) {
                    sum += arr[i][j];
                    n++;
                    m--;
                }
            }
        }

        // If matrix has odd size, center element was added twice
        // So subtract it once
        if (arr.length % 2 != 0) {
            int center = arr[arr.length / 2][arr[0].length / 2];
            sum -= center;
        }

        System.out.println("Total sum is " + sum);
    }

    // Easy and optimize method

    public static void EasySum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            // Main diagonal condition: row index == column index
            sum += arr[i][i]; // Because both i and j are same.

            // Secondary Diagonal row + col = total_Len - 1
            // so => col = total_Len - 1- i;
            // So no need for second for loop.
            if (i != arr.length - 1 - i) { // If matrix has odd size, center element was added twice
                sum += arr[i][arr.length - 1 - i];
            }
        }

    }

    public static void main(String[] args) {
        // Sample 3x3 matrix
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 6, 7, 8 }
        };

        sum(arr);
    }
}
