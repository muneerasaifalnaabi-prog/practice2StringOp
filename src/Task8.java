public class Task8 {
    public static void main(String[] args) {
        System.out.println(xyBalance("aaxbby"));


    }
    public static Boolean xyBalance(String str ) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'y') {
                return true;
            }
        }
        return false;
    }
    }

