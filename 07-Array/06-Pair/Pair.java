// Time complexity is =>  O(n^2)
public class Pair {

    public static void ArrayPair(int arr[]) {
        int totalPair = 0; // formula for this n(n-1)/2 n=number of element in array.

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + current + "," + arr[j] + ") ");
                totalPair++;
            }
            System.out.println();
        }
        System.out.println("Total pairs : " + totalPair);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 3, 7, 5, 10, 2 };
        ArrayPair(arr);
    }
}
