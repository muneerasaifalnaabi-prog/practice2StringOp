public class Task21 {
    public static void main(String[] args) {
        System.out.println(wordEnds("abcXY123XYijk", "XY"));
        System.out.println(wordEnds("XY123XY", "XY"));


    }
    public static String wordEnds(String str, String word) {
        String result = "";
        int pos = 0;
        while (pos <= str.length() - word.length()) {
            pos = str.indexOf(word, pos);
            if (pos == -1) break;
            if (pos > 0) {
                result += str.charAt(pos - 1);
            }
            if (pos + word.length() < str.length()) {
                result += str.charAt(pos + word.length());
            }
            pos += word.length();
        }
        return result;
    }

}
