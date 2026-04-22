public class XyBalance {
    public static void main(String[] args) {
        System.out.println(xyBalance("aaxbby"));
        System.out.println(xyBalance("aaxbb"));


    }
    public static Boolean xyBalance(String str ) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.contains("x") && str.contains("y")) {
                return true;
            }
        }
        return false;
    }
    }

