package 자바의정석4강;

public class exercise4_5 {
	public static void main (String[] args) {
		// for 문 예제
		/*
		for(int i=0; i<=10; i++) {
			for(int j=0; j<=i; j++)
				System.out.println("*");
			System.out.println();
		}
		*/
		
		//while 문 예제
		int i=0;
		while(i<=10) {
			int j=0;
			while(j<=i) {
				System.out.println("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
