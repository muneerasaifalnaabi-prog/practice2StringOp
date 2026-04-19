public class Task10 {
    public static void main(String[] args) {

    }
    public static String repeatEnd(String str, int n) {
       str= str.substring(str.length() - n);
        String result = "";
        for (int i = 0; i < n; i++) {
            result += str;
        }
        return result;
    }

    }
