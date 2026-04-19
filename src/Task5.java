public class Task5 {
    public static void main(String[] args) {


    }
    public static Boolean endOther(String str ,String text){.

        str= str.toLowerCase();
        text = text.toLowerCase();
        if (str.endsWith(text) || text.endsWith(str)) {
            return true;
        }
        return false;

    }
}
