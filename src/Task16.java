public class Task16 {
    public static void main(String[] args) {

    }
    public static boolean sameStarChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') {
                if (i == 0 || i == str.length() - 1) {
                    return false;  // * at start/end invalid
                }

            }
        }
    }
}
