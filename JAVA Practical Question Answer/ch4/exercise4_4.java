package 자바의정석4강;

public class exercise4_4 {
	public static void main(String[] args) {
		int sum=0;
		int i=1;
		
		while(sum<100) {
			//System.out.println(i+" - "+sum);
			if(i%2==0)
				sum-=i;
			else
				sum+=i;
			i++;
		}
		
		System.out.println(sum-1);
	}
}
