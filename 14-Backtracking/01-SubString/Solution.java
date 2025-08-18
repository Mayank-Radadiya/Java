public class Solution {

    public static void subString(String str, String result, int i) {
        if (i >= str.length()) {
            if (result.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(result);
            }
            return;
        }
        subString(str, result + str.charAt(i), i + 1);
        subString(str, result, i + 1);
    }

    public static void main(String[] args) {
        String str = "abc";

        subString(str, "", 0);

    }
}