public class RepeatFront {
    public static void main(String[] args) {
        System.out.println(repeatFront("Chocolate", 4));


    }
    public static String repeatFront(String str, int n) {
        String result = "";
        int prefixLen = n;
        while (prefixLen > 0) {
            result += str.substring(0, prefixLen);
            prefixLen--;
        }
return result;

    }
}
