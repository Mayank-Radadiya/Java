
public class Sum {

    public static void algorithm(int arr[]) {
        int currSum = 0;
        int maxSum = 0;
        int minimumSum = Integer.MIN_VALUE; // if all number are negative. find smallest negative value.

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if (currSum > maxSum) {
                maxSum = currSum;
            }

            if (currSum < 0) {
                if (currSum > minimumSum) {
                    minimumSum = currSum;
                }
                currSum = 0;
            }

        }
        if (maxSum == 0) {
            System.out.println("Maximum sum is " + minimumSum);
        } else {
            System.out.println("Maximum sum is " + maxSum);
        }
    }

    public static void main(String[] args) {
        // int arr[] = { 2, -3, 5, -6, 2, 9, -4, 3, 6 };
        int arr[] = { -5, -2, -3, -1 };

        algorithm(arr);
    }
}
