public class Task20 {
    public static void main(String[] args) {

        System.out.println(plusOut("12xy34", "xy"));
    }
    public static String plusOut(String str, String word) {
        String result = str.replaceAll(".", "+");
        int i = 0;
        while (i <= str.length() - word.length()) {
            if (str.substring(i, i + word.length()).equals(word)) {
                result = result.substring(0, i) + word +
                        result.substring(i + word.length());
                i += word.length();
            } else {
                i++;
            }
        }
        return result;
    }
    }

