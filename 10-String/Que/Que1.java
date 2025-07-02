//  Find shortest Path
// W - West N-North E-East S-South

public class Que1 {
    public static void main(String[] args) {
        String path = "WNEENESENNN";

        // Logic
        // N up => y+1
        // S Down => y-1
        // W move left => x-1
        // E move right => x + 1
        int x = 0;
        int y = 0;

        for (int i = 0; i < path.length(); i++) {
            char move = path.charAt(i); // Get current direction

            if (move == 'N') {
                y++;
            } else if (move == 'S') {
                y--;
            } else if (move == 'E') {
                x++;
            } else if (move == 'W') {
                x--;
            } else {
                System.err.println("Wrong Move: " + move);
            }
        }

        float distance = (float) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        System.out.println("Path => " + distance);
    }
}
