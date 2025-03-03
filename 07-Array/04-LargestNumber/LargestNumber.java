
public class LargestNumber {
    public static void main(String[] args) {
        int arr1[] = { 1, 22, 44, 65, 12, 54, 75, 23, 5 };
        int maxNum = Integer.MIN_VALUE; // -infinity value
        int smallest = Integer.MAX_VALUE;// +infinity value

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > maxNum) {
                maxNum = arr1[i];
            }

            if (smallest > arr1[i]) {
                smallest = arr1[i];
            }
        }

        System.out.println("maximum value is " + maxNum);
        System.out.println("minimum value is " + smallest);

    }
}
