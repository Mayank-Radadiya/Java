// By reference....Means  if function change value of array it will reflect on real array. 

import java.util.Arrays;

public class ByReference {

    public static void updateArray(int arr1[]) {
        arr1[1] = 10;
        arr1[0] = 20;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[3];
        updateArray(arr1);

        System.out.println("Updated Array: " + Arrays.toString(arr1));

    }
}
