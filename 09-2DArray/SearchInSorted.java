public class SearchInSorted {

    public static void search(int[][] arr, int key) {
        // Start from top-right corner
        int x = 0;
        int y = arr.length - 1;

        // While within bounds of the matrix
        while (x < arr.length && y >= 0) {
            // Compare the key with the current element
            if (key == arr[x][y]) {
                System.out.println("Key found at [" + x + "," + y + "]");
                return;
            } else if (key < arr[x][y]) {
                // Move left if the key is smaller
                y--;
            } else {
                // Move down if the key is larger
                x++;
            }
        }

        // If key is not found
        System.out.println("Key not found");
    }

    public static void main(String[] args) {
        // Given matrix is sorted in both row and column-wise
        int[][] arr = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };

        // Search for the key
        search(arr, 33); // It will find 33 at position (3, 1)
    }
}
