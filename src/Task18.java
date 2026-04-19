public class Task18 {
    public static void main(String[] args) {

    }
    public static String zipZap(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i - 1) == 'z' &&
                    str.charAt(i + 1) == 'p') {
                continue;
            }
            result+=str.charAt(i);
        }
        return result;

    }

}
