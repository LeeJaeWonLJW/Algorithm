package 자바의정석4강;

public class exercise4_12 {
	public static void main(String[] args) {
		for (int i=2;i<=9;) {
			int j;
			for(j=1;j<=3;j++) {
				for(int k=0;k<3;k++)
					if(i+k<10)
						System.out.print((i+k)+"*"+j+"="+(i+k)*j+"	");
				System.out.println();
			}
			System.out.println();
			i+=j-1;
		}
	}
}
