package 자바의정석4강;

public class exercise4_10 {
	public static void main(String[] args) {
		int num =12345;
		int sum = 0;
		
		for(int i=10000;i>=1;i/=10)	{
			sum+=(int)(num/i);
			num%=i;
		}
		System.out.println("sum="+sum);
	}
}
