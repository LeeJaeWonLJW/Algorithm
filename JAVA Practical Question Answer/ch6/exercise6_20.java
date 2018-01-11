public class exercise6_20 {
    public static int[] shuffle(int[] original){
        if (original==null || original.length==0)
            return original;

        for (int i=0;i<original.length;i++) {
            int random=(int)(Math.random()*original.length);

            int tmp = original[i];
            original[i]=original[random];
            original[random]=tmp;
        }

        return original;
    }

    public static void main(String[] args){
        int[] origianl = {1,2,3,4,5,6,7,8,9};
        System.out.println(java.util.Arrays.toString(origianl));

        int[] result = shuffle(origianl);
        System.out.println(java.util.Arrays.toString(origianl));
    }
}
