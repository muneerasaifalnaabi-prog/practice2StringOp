public class Task9 {
    public static void main(String[] args) {



}
    public static String mixString(String a, String b) {
        String result = "";
        int i = 0;
        while (i < a.length() && i < b.length()) {
            result += a.charAt(i) + b.charAt(i);
            i++;
        }
        result += a.substring(i) + b.substring(i);
        return result;
    }



}
