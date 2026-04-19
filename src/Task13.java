public class Task13 {
    public static void main(String[] args) {
        System.out.println(prefixAgain());
    }
    public static boolean prefixAgain(String str, int n) {
        return str.substring(n).contains(str.substring(0,n));
    }

}
