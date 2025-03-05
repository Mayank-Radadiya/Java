import java.util.Arrays;

public class SubArraySum {
    // time complexity is O(n^3)
    public static void Sum(int arr[]) {
        int maxSum = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k < j; k++) {
                    System.out.print(arr[k] + " ");
                    sum += arr[k];
                    if (sum > maxSum) {
                        maxSum = sum;
                    }
                }
                sum = 0;
                System.out.println();
            }
        }
        System.out.println("maximum sum is " + maxSum);

    }

    // time complexity is O(n^2)
    // find sum using prefix array.
    // equation for sum of any subArray is
    // prefixArray[end] - prefixArray[start-1]
    public static void preFixArraySum(int arr[]) {
        int prefixArray[] = new int[arr.length];

        prefixArray[0] = arr[0];
        // create prefix array.
        for (int i = 1; i < arr.length; i++) {
            prefixArray[i] = arr[i] + prefixArray[i - 1];
        }

        // get all subArray and get all sum of subArray.
        int currSum = 0;
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            // int start = i; // this is same thing use new variable start = ior use i in
            // inner loop.It is for easy to understand.
            for (int j = 0; j < arr.length; j++) {
                // int end = j;
                currSum = i == 0 ? prefixArray[j] : prefixArray[j] - prefixArray[i - 1];
                if (currSum > maxSum) {
                    maxSum = currSum;
                }

            }

        }

        System.out.println(Arrays.toString(prefixArray));
        System.out.println("Maximum sum is " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { 1, -3, 5, 6, -8 };
        // Sum(arr);
        preFixArraySum(arr);
    }

}