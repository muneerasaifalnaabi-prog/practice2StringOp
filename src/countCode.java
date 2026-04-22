public class countCode {
    public static void main(String[] args) {
        System.out.println(countCode("aaacodebbb"));
        System.out.println(countCode("codexxcode"));
        System.out.println(countCode("cozexxcope"));


    }
    public static Integer countCode(String str ){
        int count = 0;
        for (int i=0 ;i<str.length();i++){
            if (str.charAt(i) == 'c' &&
                    str.charAt(i + 1) == 'o' &&
                    str.charAt(i + 3) == 'e') {
                count++;
            }

        }
        return count;


    }
}
