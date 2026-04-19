public class Task15 {
    public static void main(String[] args) {
        System.out.println(getSandwich("breadjambread"));
        System.out.println(getSandwich("xxbreadjambreadyy"));

    }
    public static String getSandwich(String str) {
        int first = str.indexOf("bread");
        if (first == -1) return "";
        int last = str.indexOf("bread", first + 1);
        if (last == -1) return "";


        return str.substring(first + 5, last);


    }
}
