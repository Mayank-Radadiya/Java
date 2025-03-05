// total subArrays = n(n+1)/2
// Time Complexity: O(n^3)
// Space Complexity: O(1)

public class SubArray {

    public static void SubArrays(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {

                for (int k = i; k <= j; k++) {
                    // start from i and end to j.
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.err.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };

        SubArrays(arr);

    }
}
