package 자바의정석;

public class exercise3_10 {
	public static void main(String[] args) {
		char ch = 'A';
		
		char lowerCase = ch<97 ? (char)(ch+32) : (char)ch;
		
		System.out.println("ch:"+ch);
		System.out.println("ch to lowerCase:"+lowerCase);
	}
}
