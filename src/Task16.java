public class Task16 {
    public static void main(String[] args) {
        System.out.println(sameStarChar("xy*yzz"));
        System.out.println(sameStarChar("xy*zzz"));

    }
    public static boolean sameStarChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') {
                if (i == 0 || i == str.length() - 1) {
                    return false;
                }
                if (str.charAt(i - 1) != str.charAt(i + 1)) {
                    return false;
                }
            }
            }
        return true;
        }
    }

