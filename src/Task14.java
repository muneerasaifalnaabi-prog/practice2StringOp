public class Task14 {
    public static void main(String[] args) {
        System.out.println(xyzMiddle("AAxyzBB"));
        System.out.println(xyzMiddle("AxyzBB"));
    }
    public static boolean xyzMiddle(String str) {
        int mid = str.length()/2;

        if(!str.contains("xyz")){
            return false;
        }
        else if (str.length() % 2 == 1){
            return str.substring(mid-1, mid+2).equals("xyz");
        }
        else {
            return str.substring(mid - 1, mid + 2).equals("xyz") ||
                    str.substring(mid - 2, mid + 1).equals("xyz");
        }

    }

}
