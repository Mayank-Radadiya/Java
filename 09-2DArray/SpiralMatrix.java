public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 },
        };

        int rowStart = 0;
        int rowEnd = arr.length - 1;
        int colStart = 0;
        int colEnd = arr[0].length - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            // Top row
            for (int j = colStart; j <= colEnd; j++) {
                System.out.print(arr[rowStart][j] + " ");
            }
            rowStart++;

            // Right column
            for (int i = rowStart; i <= rowEnd; i++) {
                System.out.print(arr[i][colEnd] + " ");
            }
            colEnd--;

            // Bottom row
            if (rowStart <= rowEnd) {
                for (int j = colEnd; j >= colStart; j--) {
                    System.out.print(arr[rowEnd][j] + " ");
                }
                rowEnd--;
            }

            // Left column
            if (colStart <= colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    System.out.print(arr[i][colStart] + " ");
                }
                colStart++;
            }
        }
    }
}
