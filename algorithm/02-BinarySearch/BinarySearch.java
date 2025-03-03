// binary search
//   => O(log n)
public class BinarySearch {

    public static int algorithm(int arr1[], int key) {
        int start = 0;
        int end = arr1.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr1[mid] == key) {
                return mid;
            }

            if (arr1[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17 };
        int key = 1;

        int index = algorithm(arr1, key);

        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Key found at index " + index);
        }
    }
}
