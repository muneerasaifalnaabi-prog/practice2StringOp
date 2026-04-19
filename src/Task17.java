public class Task17 {
    public static void main(String[] args) {
        System.out.println(oneTwo("abc"));
    }
    public static String oneTwo(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i += 3) {
            if (i + 2 < str.length()) {
                result += str.charAt(i + 1) + str.charAt(i + 2) + str.charAt(i);
            }
            else {
                result += str.substring(i);
            }
            }
        return result;
    }
}
