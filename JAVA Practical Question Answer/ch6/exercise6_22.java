public class exercise6_22 {
    public static boolean isNumber(String str){
        if (str==null || str.length()==0)
            return false;

        for (int i=0;i<str.length();i++){
            if ((int)str.charAt(i)>=(int)'0' && (int)str.charAt(i)<=(int)'9');
            else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str="123";
        System.out.println(str+"는 숫자입니까? "+isNumber(str));

        str="1234o";
        System.out.println(str+"는 숫자입니까? "+isNumber(str));
    }
}
