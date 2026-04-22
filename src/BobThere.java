public class BobThere {
    public static void main(String[] args) {
        System.out.println(bobThere("abcbob"));
        System.out.println(bobThere("bac"));

    }
    public static Boolean bobThere(String str ){
        for (int i=0 ;i<str.length();i++){
            if (str.charAt(i) == 'b' &&
                    str.charAt(i + 2) == 'b') {
               return true;
            }

        }
        return false;
    }
}
