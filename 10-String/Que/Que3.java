
public class Que3 {

    public static String Compression(String str) {

        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            sb.append(str.charAt(i));
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            if (count != 1) {
                sb.append(Integer.toString(count));
            }
        }

        return sb.toString();

    }

    public static void main(String[] args) {
        String str = new String("aaabbc");
        System.out.println(Compression(str));
    }
}
