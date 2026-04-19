public class Task8 {
    public static void main(String[] args) {

    }
    public static Boolean bobThere(String str ){
        for (int i=0 ;i<str.length();i++){
            if (str.charAt(i) == 'x' &&
                    str.charAt(i + 1) == 'y') {
                return true;
            }

        }
        return false;
    }

    }
}
