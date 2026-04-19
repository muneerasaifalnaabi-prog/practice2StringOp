public class Task6 {
    public static void main(String[] args) {
        System.out.println(xyzThere("abcxyz"));

    }
    public static Boolean xyzThere(String str ){
        if (str.contains("xyz") && !str.contains(".")){
            return true;

        }
        return false;



    }

}
