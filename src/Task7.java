public class Task7 {
    public static void main(String[] args) {
        System.out.println(bobThere("abcbob"));

    }
    public static Boolean bobThere(String str ){
        for (int i=0 ;i<str.length();i++){
            if (str.charAt(i) == 'b' &&
                    str.charAt(i + 1) == 'o' &&
                    str.charAt(i + 3) == 'b') {
               return true;
            }

        }
        return false;
    }
}
