public class Task21 {
    public static void main(String[] args) {



    }
    public static String wordEnds(String str, String word) {
        String result = "";
        int pos = 0;
        while (pos <= str.length() - word.length()) {
            pos = str.indexOf(word, pos);
        }
    }

}
