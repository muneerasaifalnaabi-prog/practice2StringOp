public class Task13 {
    public static void main(String[] args) {
        System.out.println(prefixAgain("abXYabc", 1));
        System.out.println(prefixAgain("abXYabc", 2));
    }
    public static boolean prefixAgain(String str, int n) {
        return str.substring(n).contains(str.substring(0,n));
    }

}
