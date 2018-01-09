public class exercise5_10 {
    public static void main(String[] args) {
        char[] abcCode =
                { '`','~','!','@','#','$','%','^','&','*',
                        '(',')','-','_','+','=','|','[',']','{', '}',';',':',',','.','/'};
        char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};

        String src = "abc123";
        String result = "";

        for (int i=0;i<src.length();i++){
            char ch = src.charAt(i);
            if((int)ch>=97&&(int)ch<=122)
                result+=abcCode[(int)ch-97];
            else if((int)ch>=48&&(int)ch<=57)
                result+=numCode[(int)ch-48];
        }

        System.out.println("src:"+src);
        System.out.println("result:"+result);
    }
}
