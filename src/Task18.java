public class Task18 {
    public static void main(String[] args) {
        System.out.println(zipZap("zipXzap"));

    }
    public static String zipZap(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i > 0 && i < str.length() - 1 && str.charAt(i - 1) == 'z' &&
                    str.charAt(i + 1) == 'p') {
                continue;
            }
            result+=str.charAt(i);
        }
        return result;

    }


}
