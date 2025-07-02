//  Print a Uppercase of first letter of each word.
public class Que2 {

    public static void UpperCase(String str) {

        StringBuilder newStr = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        newStr.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                newStr.append(str.charAt(i));
                i++;
                newStr.append(Character.toUpperCase(str.charAt(i)));
            } else {
                newStr.append(str.charAt(i));
            }
        }

        System.out.println(newStr.toString());
    }

    public static void main(String[] args) {
        String z = "hello my name is xyz.";
        UpperCase(z);
    }
}
