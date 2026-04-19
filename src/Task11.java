public class Task11 {
    public static void main(String[] args) {


    }
    public static String repeatFront(String str, int n) {
        String result = "";
        int prefixLen = n;
        while (prefixLen > 0) {
            result += str.substring(0, prefixLen);
            prefixLen--;
        }


    }
}
