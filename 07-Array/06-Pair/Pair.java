
public class Pair {

    public static void ArrayPair(int arr[]) {
        int index = 0;
        int range = arr.length - 1;

        while (index < arr.length) {
            for (int i = 1; i <= range; i++) {
                System.out.print("(" + arr[index] + "," + arr[index + i] + ") ,");
            }
            System.out.println();
            index++;
            range--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        ArrayPair(arr);
    }
}
