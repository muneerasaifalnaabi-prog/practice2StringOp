public class Task19 {
    public static void main(String[] args) {
        System.out.println(starOut("ab*cd"));
        System.out.println(starOut("ab**cd"));

    }

    public static String starOut(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if ((i > 0 && str.charAt(i-1) == '*') ||
                    str.charAt(i) == '*' ||
                    (i + 1 < str.length() && str.charAt(i+1) == '*')) {
                continue;
            }
            result += str.charAt(i);
        }
        return result;
    }

    }


