public class Task19 {
    public static void main(String[] args) {

    }

    public static String starOut(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') {
                i++;
                continue;
            }
            result += str.charAt(i);
        }
    }
}
