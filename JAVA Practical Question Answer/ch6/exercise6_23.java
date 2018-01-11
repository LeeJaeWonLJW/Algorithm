public class exercise6_23 {
    public static int max(int[] data){
        if (data==null || data.length==0)
            return -999999;

        int max=-999999;
        for (int chk:data){
            if (chk>max)
                max=chk;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] data = {3,2,9,4,7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값:"+max(data));
        System.out.println("최대값:"+max(null));
        System.out.println("최대값:"+max(new int[]{}));
    }
}
