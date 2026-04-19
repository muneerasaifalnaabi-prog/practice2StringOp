public class Task1 {
    public static void main(String[] args) {
        String result = "The";
        System.out.println(doubleChar("The"));

    }
    public static String doubleChar(String str ){
        String result ="";
        for (int i=0 ;i<str.length();i++){

            char c =str.charAt(i);
            result+=c+c;


        }
        return result;

    }
}
