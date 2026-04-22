public class CatDog {
    public static void main(String[] args) {
        System.out.println(catDog("catdog"));
        System.out.println(catDog("catcat"));

    }
    public static Boolean catDog(String str ){

        for (int i=0 ;i<str.length();i++){
            if (str.contains("cat") && str.contains("dog")){
                return true;
            }

        }
        return false;
    }

}
