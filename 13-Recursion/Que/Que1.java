public class Que1 {

    public static int pairingWithFriends(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        // Single + two
        return pairingWithFriends(n - 1) + (n - 1) * pairingWithFriends(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(pairingWithFriends(3));
    }
}
