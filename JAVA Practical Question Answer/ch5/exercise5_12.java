import java.util.Scanner;

public class exercise5_12 {
    public static void main(String[] args) {
        String[] words = {"chair","computer","integer"};
        String[] sheet = {"의자","컴퓨터","정수"};

        Scanner scanner = new Scanner(System.in);

        int score=0;
        int i=0;

        for (i=0;i<words.length;i++) {
            char[] question = words[i].toCharArray();

            System.out.printf("Q%d. %s의 뜻은? ",i+1,new String(question));

            String answer = scanner.nextLine();

            //System.out.println(sheet[i]+ " , " +answer);
            if (sheet[i].equals(answer)) {
                System.out.printf("맞았습니다.%n%n");
                score++;
            }
            else
                System.out.printf("틀렸습니다. 정답은 %s입니다.%n%n",new String(sheet[i]));
        }
        System.out.printf("전체 %d문제 중 %d문제 맞추셨습니다.",i,score);
    }
}
